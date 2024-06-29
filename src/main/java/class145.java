import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class145 extends class9 {

    @OriginalMember(owner = "client!vd", name = "Tc", descriptor = "I")
    public int field3513 = 0;

    @OriginalMember(owner = "client!vd", name = "bd", descriptor = "I")
    public int field3521 = 0;

    @OriginalMember(owner = "client!vd", name = "Rc", descriptor = "I")
    public int field3511 = -1;

    @OriginalMember(owner = "client!vd", name = "Oc", descriptor = "Z")
    public boolean field3508 = false;

    @OriginalMember(owner = "client!vd", name = "cd", descriptor = "I")
    public int field3522 = 0;

    @OriginalMember(owner = "client!vd", name = "dd", descriptor = "I")
    public int field3523 = 0;

    @OriginalMember(owner = "client!vd", name = "Bd", descriptor = "I")
    public int field3547 = 0;

    @OriginalMember(owner = "client!vd", name = "zd", descriptor = "I")
    public int field3545 = -1;

    @OriginalMember(owner = "client!vd", name = "Sc", descriptor = "Lu;")
    public static class135 field3512 = class87.method676((byte) -44, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!vd", name = "jd", descriptor = "I")
    public static int field3529 = 0;

    @OriginalMember(owner = "client!vd", name = "ad", descriptor = "Lu;")
    public static class135 field3520 = class87.method676((byte) -63, " )2> @lre@");

    @OriginalMember(owner = "client!vd", name = "Xc", descriptor = "I")
    public static int field3517 = 0;

    @OriginalMember(owner = "client!vd", name = "ud", descriptor = "Z")
    public static volatile boolean field3540 = false;

    @OriginalMember(owner = "client!vd", name = "md", descriptor = "Lu;")
    private static class135 field3532 = class87.method676((byte) -103, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!vd", name = "pd", descriptor = "Lu;")
    public static class135 field3535 = class87.method676((byte) -84, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!vd", name = "xd", descriptor = "Lu;")
    public static class135 field3543 = field3532;

    @OriginalMember(owner = "client!vd", name = "Pc", descriptor = "I")
    public int field3509;

    @OriginalMember(owner = "client!vd", name = "Qc", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!vd", name = "Uc", descriptor = "I")
    public int field3514;

    @OriginalMember(owner = "client!vd", name = "Yc", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!vd", name = "Zc", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!vd", name = "ed", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!vd", name = "fd", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!vd", name = "hd", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!vd", name = "id", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!vd", name = "kd", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!vd", name = "ld", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!vd", name = "nd", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!vd", name = "od", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!vd", name = "qd", descriptor = "I")
    public int field3536;

    @OriginalMember(owner = "client!vd", name = "rd", descriptor = "I")
    public int field3537;

    @OriginalMember(owner = "client!vd", name = "td", descriptor = "I")
    public int field3539;

    @OriginalMember(owner = "client!vd", name = "vd", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!vd", name = "wd", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!vd", name = "yd", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!vd", name = "Ad", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!vd", name = "Cd", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!vd", name = "Wc", descriptor = "Lu;")
    public class135 field3516;

    @OriginalMember(owner = "client!vd", name = "gd", descriptor = "Ldc;")
    public class25 field3526;

    @OriginalMember(owner = "client!vd", name = "sd", descriptor = "Lg;")
    public static class43 field3538;

    @OriginalMember(owner = "client!vd", name = "Vc", descriptor = "Lna;")
    public class91 field3515;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLic;)V")
    public final void method1184(boolean arg0, class59 arg1) {
        arg1.field1485 = 0;
        ++field3541;
        int var3 = arg1.method480(0);
        this.field3511 = arg1.method475(-49152);
        int var4 = -1;
        this.field3545 = arg1.method475(-49152);
        this.field3547 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg1.method480(0);
            if (~var7 == -1) {
                var5[var6] = 0;
            } else {
                int var8 = arg1.method480(0);
                var5[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && var5[0] == 65535) {
                    var4 = arg1.method483((byte) 24);
                    break;
                }
                if (~var5[var6] <= -513) {
                    int var12 = class41.method306(-105, var5[var6] + -512).field2225;
                    if (~var12 != -1) {
                        this.field3547 = var12;
                    }
                }
            }
        }
        if (!arg0) {
            method1188(false);
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg1.method480(0);
            if (~var11 > -1 || var11 >= class125.field2988[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field232 = arg1.method483((byte) 24);
        if (super.field232 == 65535) {
            super.field232 = -1;
        }
        super.field217 = arg1.method483((byte) 24);
        if (super.field217 == 65535) {
            super.field217 = -1;
        }
        super.field185 = super.field217;
        super.field198 = arg1.method483((byte) 24);
        if (super.field198 == 65535) {
            super.field198 = -1;
        }
        super.field191 = arg1.method483((byte) 24);
        if (super.field191 == 65535) {
            super.field191 = -1;
        }
        super.field203 = arg1.method483((byte) 24);
        if (~super.field203 == -65536) {
            super.field203 = -1;
        }
        super.field196 = arg1.method483((byte) 24);
        if (super.field196 == 65535) {
            super.field196 = -1;
        }
        super.field178 = arg1.method483((byte) 24);
        if (~super.field178 == -65536) {
            super.field178 = -1;
        }
        this.field3516 = class131.method1054(false, arg1.method444(0)).method1088((byte) 56);
        this.field3523 = arg1.method480(0);
        this.field3513 = arg1.method483((byte) 24);
        if (this.field3526 == null) {
            this.field3526 = new class25();
        }
        this.field3526.method200(var4, ~var3 == -2, var9, var5, (byte) 24);
    }

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "(I)V")
    public static final void method1185(int arg0) {
        if (~class47.field1125 == -1 && !class8.field143) {
            class95.method785(class76.field1798, (byte) -99, class53.field1278, class113.field2742, class99.field2403, 0, 35);
            ++class1.field23;
        }
        if (arg0 != 22907) {
            field3543 = null;
        }
        ++field3530;
        int var1 = -1;
        for (int var2 = 0; var2 < class91.field2180; ++var2) {
            int var3 = class91.field2168[var2];
            int var4 = var3 & 127;
            int var5 = (var3 & 536856387) >> 14;
            int var6 = 127 & var3 >> 7;
            int var7 = var3 >> 29 & 3;
            if (~var1 != ~var3) {
                var1 = var3;
                if (var7 == 2 && ~class100.field2418.method998(class136.field3301, var4, var6, var3) <= -1) {
                    class119 var8 = class2.method9(false, var5);
                    if (var8.field2825 != null) {
                        var8 = var8.method946(arg0 ^ 22907);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (~class47.field1125 != -2) {
                        if (!class8.field143) {
                            class135[] var9 = var8.field2887;
                            ++class68.field1687;
                            if (class1.field21) {
                                var9 = class17.method114((byte) -112, var9);
                            }
                            if (var9 != null) {
                                for (int var10 = 4; ~var10 <= -1; --var10) {
                                    if (var9[var10] != null) {
                                        ++class131.field3168;
                                        short var11 = 0;
                                        if (~var10 == -1) {
                                            var11 = 54;
                                        }
                                        if (~var10 == -2) {
                                            var11 = 42;
                                        }
                                        if (~var10 == -3) {
                                            var11 = 28;
                                        }
                                        if (var10 == 3) {
                                            var11 = 24;
                                        }
                                        if (var10 == 4) {
                                            var11 = 1005;
                                        }
                                        class95.method785(var6, (byte) -99, var4, class107.method867(arg0 + -22905, new class135[] { class129.field3097, var8.field2891 }), var9[var10], var3, var11);
                                    }
                                }
                            }
                            class95.method785(var6, (byte) -99, var4, class107.method867(2, new class135[] { class129.field3097, var8.field2891 }), class2.field67, var8.field2873 << 14, 1001);
                        } else if (~(4 & class79.field1887) == -5) {
                            ++class139.field3374;
                            class95.method785(var6, (byte) -99, var4, class107.method867(2, new class135[] { class4.field102, class93.field2205, var8.field2891 }), class30.field741, var3, 33);
                        }
                    } else {
                        class95.method785(var6, (byte) -99, var4, class107.method867(arg0 + -22905, new class135[] { class141.field3433, class93.field2205, var8.field2891 }), class108.field2607, var3, 10);
                        ++class25.field615;
                    }
                }
                if (~var7 == -2) {
                    class111 var12 = class96.field2340[var5];
                    if (~var12.field2697.field1319 == -2 && ~(127 & var12.field173) == -65 && ~(127 & var12.field172) == -65) {
                        for (int var13 = 0; var13 < class34.field790; ++var13) {
                            class111 var16 = class96.field2340[class47.field1124[var13]];
                            if (var16 != null && var12 != var16 && ~var16.field2697.field1319 == -2 && ~var12.field173 == ~var16.field173 && var12.field172 == var16.field172) {
                                class58.method441(var16.field2697, 15098, var6, class47.field1124[var13], var4);
                            }
                        }
                        for (int var14 = 0; class14.field329 > var14; ++var14) {
                            class145 var15 = class131.field3166[class108.field2600[var14]];
                            if (var15 != null && ~var12.field173 == ~var15.field173 && ~var12.field172 == ~var15.field172) {
                                class111.method908(var15, var6, var4, class108.field2600[var14], -401);
                            }
                        }
                    }
                    class58.method441(var12.field2697, arg0 ^ 25473, var6, var5, var4);
                }
                if (~var7 == -1) {
                    class145 var17 = class131.field3166[var5];
                    if ((var17.field173 & 127) == 64 && ~(127 & var17.field172) == -65) {
                        for (int var18 = 0; class34.field790 > var18; ++var18) {
                            class111 var21 = class96.field2340[class47.field1124[var18]];
                            if (var21 != null && ~var21.field2697.field1319 == -2 && var17.field173 == var21.field173 && ~var17.field172 == ~var21.field172) {
                                class58.method441(var21.field2697, 15098, var6, class47.field1124[var18], var4);
                            }
                        }
                        for (int var19 = 0; ~var19 > ~class14.field329; ++var19) {
                            class145 var20 = class131.field3166[class108.field2600[var19]];
                            if (var20 != null && var17 != var20 && ~var17.field173 == ~var20.field173 && ~var17.field172 == ~var20.field172) {
                                class111.method908(var20, var6, var4, class108.field2600[var19], arg0 + -23308);
                            }
                        }
                    }
                    class111.method908(var17, var6, var4, var5, -401);
                }
                if (var7 == 3) {
                    class23 var22 = class48.field1142[class136.field3301][var4][var6];
                    if (var22 != null) {
                        for (class105 var23 = (class105) var22.method191(-8986); var23 != null; var23 = (class105) var22.method192(16)) {
                            class94 var24 = class41.method306(arg0 + -22999, var23.field2530);
                            if (class47.field1125 == 1) {
                                ++class39.field897;
                                class95.method785(var6, (byte) -99, var4, class107.method867(2, new class135[] { class141.field3433, field3520, var24.field2284 }), class108.field2607, var23.field2530, 6);
                            } else if (class8.field143) {
                                if ((1 & class79.field1887) == 1) {
                                    class95.method785(var6, (byte) -99, var4, class107.method867(2, new class135[] { class4.field102, field3520, var24.field2284 }), class30.field741, var23.field2530, 48);
                                    ++class39.field890;
                                }
                            } else {
                                ++class53.field1253;
                                class135[] var25 = var24.field2242;
                                if (class1.field21) {
                                    var25 = class17.method114((byte) -122, var25);
                                }
                                for (int var26 = 4; ~var26 <= -1; --var26) {
                                    if (var25 != null && var25[var26] != null) {
                                        byte var27 = 0;
                                        ++class135.field3242;
                                        if (~var26 == -1) {
                                            var27 = 11;
                                        }
                                        if (~var26 == -2) {
                                            var27 = 37;
                                        }
                                        if (var26 == 2) {
                                            var27 = 15;
                                        }
                                        if (var26 == 3) {
                                            var27 = 27;
                                        }
                                        if (~var26 == -5) {
                                            var27 = 40;
                                        }
                                        class95.method785(var6, (byte) -99, var4, class107.method867(2, new class135[] { class65.field1630, var24.field2284 }), var25[var26], var23.field2530, var27);
                                    } else if (~var26 == -3) {
                                        ++class77.field1807;
                                        class95.method785(var6, (byte) -99, var4, class107.method867(2, new class135[] { class65.field1630, var24.field2284 }), class124.field2970, var23.field2530, 15);
                                    }
                                }
                                class95.method785(var6, (byte) -99, var4, class107.method867(arg0 + -22905, new class135[] { class65.field1630, var24.field2284 }), class2.field67, var23.field2530, 1003);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "(I)V")
    public static final void method1186(int arg0) {
        ++field3548;
        int var1 = class23.field581.method934((byte) 127, 8);
        if (~var1 > ~class14.field329) {
            for (int var2 = var1; var2 < class14.field329; ++var2) {
                class101.field2443[client.field526++] = class108.field2600[var2];
            }
        }
        if (class14.field329 < var1) {
            throw new RuntimeException("gppov1");
        } else {
            class14.field329 = 0;
            if (arg0 != 17738) {
                method1191(-93, 117, 75);
            }
            for (int var3 = 0; var3 < var1; ++var3) {
                int var4 = class108.field2600[var3];
                class145 var5 = class131.field3166[var4];
                int var6 = class23.field581.method934((byte) 123, 1);
                if (var6 == 0) {
                    class108.field2600[class14.field329++] = var4;
                    var5.field184 = class126.field2998;
                } else {
                    int var7 = class23.field581.method934((byte) 110, 2);
                    if (var7 == 0) {
                        class108.field2600[class14.field329++] = var4;
                        var5.field184 = class126.field2998;
                        class97.field2358[class126.field3009++] = var4;
                    } else if (var7 == 1) {
                        class108.field2600[class14.field329++] = var4;
                        var5.field184 = class126.field2998;
                        int var8 = class23.field581.method934((byte) 114, 3);
                        var5.method47(var8, false, false);
                        int var9 = class23.field581.method934((byte) 101, 1);
                        if (var9 == 1) {
                            class97.field2358[class126.field3009++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class108.field2600[class14.field329++] = var4;
                        var5.field184 = class126.field2998;
                        int var10 = class23.field581.method934((byte) 112, 3);
                        var5.method47(var10, false, true);
                        int var11 = class23.field581.method934((byte) 114, 3);
                        var5.method47(var11, false, true);
                        int var12 = class23.field581.method934((byte) 119, 1);
                        if (~var12 == -2) {
                            class97.field2358[class126.field3009++] = var4;
                        }
                    } else if (var7 == 3) {
                        class101.field2443[client.field526++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)I")
    public static final int method1187(int arg0, boolean arg1) {
        if (arg1) {
            field3525 = 76;
        }
        ++field3510;
        int var2 = 0;
        if (arg0 < 0 || ~arg0 <= -65537) {
            var2 += 16;
            arg0 >>>= 16;
        }
        if (~arg0 <= -257) {
            arg0 >>>= 8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 4;
        }
        if (~arg0 <= -5) {
            var2 += 2;
            arg0 >>>= 2;
        }
        if (~arg0 <= -2) {
            arg0 >>>= 1;
            ++var2;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
    public static void method1188(boolean arg0) {
        field3532 = null;
        field3512 = null;
        field3538 = null;
        field3535 = null;
        field3543 = null;
        if (!arg0) {
            field3520 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)Lna;")
    public final class91 method273(byte arg0) {
        ++field3527;
        if (this.field3526 == null) {
            return null;
        } else {
            class84 var2 = ~super.field170 != 0 && ~super.field177 == -1 ? class17.method108(super.field170, 0) : null;
            class84 var3 = ~super.field159 == 0 || this.field3508 || super.field232 == super.field159 && var2 != null ? null : class17.method108(super.field159, 0);
            class91 var4 = this.field3526.method209(-113, super.field163, var3, var2, super.field194);
            int var5 = 36 / ((-59 - arg0) / 51);
            if (var4 == null) {
                return null;
            } else {
                var4.method702();
                super.field167 = var4.field3495;
                if (!this.field3508 && ~super.field155 != 0 && super.field201 != -1) {
                    class91 var6 = class44.method345(super.field155, true).method146(30814, super.field201);
                    if (var6 != null) {
                        class91[] var7 = new class91[] { var4, var6 };
                        var6.method707(0, -super.field188, 0);
                        var4 = new class91(var7, 2);
                    }
                }
                if (!this.field3508 && this.field3515 != null) {
                    if (~class126.field2998 <= ~this.field3521) {
                        this.field3515 = null;
                    }
                    if (class126.field2998 >= this.field3522 && this.field3521 > class126.field2998) {
                        class91 var8 = this.field3515;
                        var8.method707(-super.field173 + this.field3514, this.field3536 - this.field3509, this.field3539 - super.field172);
                        if (~super.field213 != -513) {
                            if (~super.field213 != -1025) {
                                if (super.field213 == 1536) {
                                    var8.method692();
                                }
                            } else {
                                var8.method692();
                                var8.method692();
                            }
                        } else {
                            var8.method692();
                            var8.method692();
                            var8.method692();
                        }
                        class91[] var9 = new class91[] { var4, var8 };
                        var4 = new class91(var9, 2);
                        if (~super.field213 == -513) {
                            var8.method692();
                        } else if (super.field213 != 1024) {
                            if (super.field213 == 1536) {
                                var8.method692();
                                var8.method692();
                                var8.method692();
                            }
                        } else {
                            var8.method692();
                            var8.method692();
                        }
                        var8.method707(super.field173 - this.field3514, -this.field3536 + this.field3509, -this.field3539 + super.field172);
                    }
                }
                var4.field2125 = true;
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILg;I)Lbc;")
    public static final class11 method1189(int arg0, int arg1, class43 arg2, int arg3) {
        ++field3544;
        if (arg1 >= -61) {
            method1190(73);
        }
        return !class79.method626((byte) -47, arg2, arg0, arg3) ? null : class5.method22(1);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)Z")
    public final boolean method45(byte arg0) {
        ++field3533;
        if (arg0 != 55) {
            this.field3511 = -101;
        }
        return this.field3526 != null;
    }

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "(I)V")
    public static final void method1190(int arg0) {
        ++field3546;
        if (class104.field2501 != null) {
            class104.field2501.method874((byte) -101);
            class104.field2501 = null;
        }
        class86.method675(217);
        class100.field2418.method1017();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class58.field1437[var1].method817(125);
        }
        System.gc();
        class21.method158(2, (byte) 30);
        class78.field1848 = -1;
        if (arg0 >= -42) {
            method1185(-91);
        }
        class69.field1709 = false;
        class79.method625(0);
        class125.method978(10, 1);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)I")
    public static final int method1191(int arg0, int arg1, int arg2) {
        ++field3528;
        if (arg0 != -6) {
            return -73;
        } else if (~arg2 == 0) {
            return 12345678;
        } else {
            int var3 = (arg2 & 127) * arg1 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBILpe;ZII)V")
    public static final void method1192(int arg0, byte arg1, int arg2, class109 arg3, boolean arg4, int arg5, int arg6) {
        ++field3542;
        if (arg5 != -3694) {
            field3538 = null;
        }
        long var7 = (long) ((arg6 << 16) + arg2);
        class128 var9 = (class128) class41.field960.method842(var7, arg5 + 3821);
        if (var9 == null) {
            class128 var10 = (class128) class39.field895.method842(var7, 123);
            if (var10 == null) {
                class128 var11 = (class128) class128.field3082.method842(var7, 126);
                if (var11 != null) {
                    if (arg4) {
                        var11.method921(2001);
                        class41.field960.method836(var7, (byte) 85, var11);
                        ++class83.field1975;
                        --class82.field1923;
                    }
                } else {
                    if (!arg4) {
                        class128 var12 = (class128) class30.field716.method842(var7, 126);
                        if (var12 != null) {
                            return;
                        }
                    }
                    class128 var13 = new class128();
                    var13.field3079 = arg1;
                    var13.field3080 = arg3;
                    var13.field3084 = arg0;
                    if (arg4) {
                        class41.field960.method836(var7, (byte) 83, var13);
                        ++class83.field1975;
                    } else {
                        class100.field2408.method822(arg5 + 3694, var13);
                        class128.field3082.method836(var7, (byte) 92, var13);
                        ++class82.field1923;
                    }
                }
            }
        }
    }
}
