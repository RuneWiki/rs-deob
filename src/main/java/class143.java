import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class143 extends class214 {

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    private int field2221 = 4096;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    private int field2227 = 4096;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "[I")
    private int[] field2226 = new int[3];

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    private int field2220 = 4096;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    private int field2229 = 409;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "J")
    public static long field2224 = 0L;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V")
    public static final void method1107(int arg0) {
        if (~class576.field8163 <= -1) {
            long var1 = class18.method109(-11121);
            class576.field8163 = (int) ((long) class576.field8163 - (-class246.field3953 + var1));
            if (~class576.field8163 < -1) {
                int var3 = (class576.field8163 << 8) / class672.field9515;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class624.field8744 = ((16711935 & class748.field10447) * var3 - -((16711935 & class449.field6549.field215) * var4) & -16711936) + (16711680 & (65280 & class748.field10447) * var3 + (65280 & class449.field6549.field215) * var4) >>> 8;
                float var6 = 1.0F - var5;
                class758.field10560 = (class449.field6549.field220 - class356.field5389) * var6 + class356.field5389;
                class429.field6283 = class86.field1264 * var3 + class449.field6549.field217 * var4 >> 8;
                class257.field4037 = (16711680 & (65280 & class293.field4497) * var3 + (class449.field6549.field209 & 65280) * var4) + (-16711936 & (16711935 & class293.field4497) * var3 + (16711935 & class449.field6549.field209) * var4) >>> 8;
                class3.field15 = (class449.field6549.field206 - class85.field1252) * var6 + class85.field1252;
                class416.field6111 = (-class678.field9559 + class449.field6549.field205) * var6 + class678.field9559;
                class467.field6802 = (class449.field6549.field207 - class565.field8013) * var6 + class565.field8013;
                class195.field3356 = (-class352.field5147 + class449.field6549.field213) * var6 + class352.field5147;
                class442.field6428 = (-class332.field4882 + class449.field6549.field211) * var6 + class332.field4882;
                if (class193.field3337 != class449.field6549.field210) {
                    class103.field1529 = class565.field8015.method1242(class193.field3337, class449.field6549.field210, var6, class103.field1529);
                }
            } else {
                class576.field8163 = -1;
                class429.field6283 = class449.field6549.field217;
                class758.field10560 = class449.field6549.field220;
                class416.field6111 = class449.field6549.field205;
                class442.field6428 = class449.field6549.field211;
                class257.field4037 = class449.field6549.field209;
                class467.field6802 = class449.field6549.field207;
                class3.field15 = class449.field6549.field206;
                class103.field1529 = class449.field6549.field210;
                class195.field3356 = class449.field6549.field213;
                class624.field8744 = class449.field6549.field215;
            }
            class246.field3953 = var1;
        }
        ++field2228;
        if (arg0 != 0) {
            method1110((String) null, false);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class143() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            int var5 = arg1.method1952(22085);
                            this.field2226[0] = class636.method3603(267386880, var5 << 4);
                            this.field2226[1] = class636.method3603(var5 >> 4, 4080);
                            this.field2226[2] = class636.method3603(var5 >> 12, 0);
                        }
                    } else {
                        this.field2221 = arg1.method1989((byte) -107);
                    }
                } else {
                    this.field2227 = arg1.method1989((byte) -47);
                }
            } else {
                this.field2220 = arg1.method1989((byte) -115);
            }
        } else {
            this.field2229 = arg1.method1989((byte) -85);
        }
        ++field2225;
        if (arg0 < 92) {
            this.field2229 = -83;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILha;Lraa;)V")
    public static final void method1108(int arg0, class544 arg1, class353 arg2) {
        ++field2219;
        boolean var3 = class556.field7917.method744(arg2.field5316 | arg0, (byte) 124, arg2.field5362, arg2.field5328, arg2.field5337 ? class145.field2251.field8138 : null, arg2.field5367, arg1, arg2.field5233) == null;
        if (var3) {
            class596.field8447.method3472(117, new class7(arg2.field5328, arg2.field5367, arg2.field5362, arg2.field5316 | -16777216, arg2.field5233, arg2.field5337));
            class717.method3960(arg2, (byte) 96);
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V")
    public static final void method1109(byte arg0) {
        ++field2223;
        if (class152.field2373 > 1) {
            --class152.field2373;
            class104.field1543 = class180.field3060;
        }
        if (class612.field8625) {
            class612.field8625 = false;
            class498.method3019(7);
        } else {
            if (!class32.field304) {
                class215.method1551(0);
            }
            for (int var1 = 0; var1 < 100 && class14.method66((byte) -114); ++var1) {
            }
            if (~class521.field7529 == -11) {
                while (class494.method3002(45)) {
                    class540 var2 = class257.method1732(true, class744.field10423, class655.field9332);
                    var2.field7707.method1926(0, 65280);
                    int var3 = var2.field7707.field4534;
                    class33.method167((byte) -111, var2.field7707);
                    var2.field7707.method1986(-var3 + var2.field7707.field4534, 1);
                    class756.method4211(var2, 125);
                }
                if (class53.field851 != null) {
                    if (class53.field851.field5583 != -1) {
                        class540 var4 = class257.method1732(true, class684.field9671, class655.field9332);
                        var4.field7707.method1939(class53.field851.field5583, 1134947720);
                        class756.method4211(var4, 127);
                        class53.field851 = null;
                        class73.field1102 = 30000L + class18.method109(-11121);
                    }
                } else if (~class73.field1102 >= ~class18.method109(arg0 + -11060)) {
                    class53.field851 = class688.field9778.method2522(class229.field3703.field7535, (byte) 57);
                }
                class703 var5 = (class703) client.field6492.method3463((byte) -50);
                if (var5 != null || ~(class18.method109(arg0 ^ 11084) - 2000L) < ~class374.field5653) {
                    class540 var6 = null;
                    int var7 = 0;
                    for (class703 var8 = (class703) class508.field7388.method3463((byte) -50); var8 != null && (var6 == null || var6.field7707.field4534 - var7 < 240); var8 = (class703) class508.field7388.method3469((byte) 107)) {
                        var8.method636((byte) 97);
                        int var9 = var8.method3017((byte) 61);
                        if (~var9 <= 0) {
                            if (var9 > 65534) {
                                var9 = 65534;
                            }
                        } else {
                            var9 = -1;
                        }
                        int var10 = var8.method3020(arg0 ^ 63);
                        if (~var10 <= 0) {
                            if (~var10 < -65535) {
                                var10 = 65534;
                            }
                        } else {
                            var10 = -1;
                        }
                        if (~class753.field10494 != ~var10 || ~class241.field3899 != ~var9) {
                            if (var6 == null) {
                                var6 = class257.method1732(true, class576.field8165, class655.field9332);
                                ++class757.field10536;
                                var6.field7707.method1926(0, 65280);
                                var7 = var6.field7707.field4534;
                            }
                            int var11 = -class753.field10494 + var10;
                            class753.field10494 = var10;
                            int var12 = -class241.field3899 + var9;
                            class241.field3899 = var9;
                            int var13 = (int) ((var8.method3024(false) + -class374.field5653) / 20L);
                            if (var13 < 8 && var11 >= -32 && ~var11 >= -32 && var12 >= -32 && var12 <= 31) {
                                var12 += 32;
                                var11 += 32;
                                var6.field7707.method1939((var11 << 6) + (var13 << 12) + var12, 1134947720);
                            } else if (var13 < 32 && var11 >= -128 && ~var11 >= -128 && var12 >= -128 && var12 <= 127) {
                                var11 += 128;
                                var6.field7707.method1926(var13 + 128, 65280);
                                var12 += 128;
                                var6.field7707.method1939((var11 << 8) - -var12, arg0 + 1134947781);
                            } else if (~var13 > -33) {
                                var6.field7707.method1926(var13 + 192, 65280);
                                if (var10 != 1 && var9 != -1) {
                                    var6.field7707.method1970((byte) 29, var10 | var9 << 16);
                                } else {
                                    var6.field7707.method1970((byte) 29, Integer.MIN_VALUE);
                                }
                            } else {
                                var6.field7707.method1939(var13 + 57344, 1134947720);
                                if (~var10 != -2 && ~var9 != 0) {
                                    var6.field7707.method1970((byte) 29, var10 | var9 << 16);
                                } else {
                                    var6.field7707.method1970((byte) 29, Integer.MIN_VALUE);
                                }
                            }
                            class374.field5653 = var8.method3024(false);
                        }
                    }
                    if (var6 != null) {
                        var6.field7707.method1986(-var7 + var6.field7707.field4534, arg0 + 62);
                        class756.method4211(var6, 114);
                    }
                }
                if (arg0 != -61) {
                    field2224 = 83L;
                }
                if (var5 != null) {
                    long var14 = (var5.method3024(false) - class724.field10165) / 50L;
                    if (var14 > 32767L) {
                        var14 = 32767L;
                    }
                    class724.field10165 = var5.method3024(false);
                    int var16 = var5.method3017((byte) 61);
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (~var16 < -65536) {
                        var16 = 65535;
                    }
                    int var17 = var5.method3020(-4);
                    if (~var17 <= -1) {
                        if (~var17 < -65536) {
                            var17 = 65535;
                        }
                    } else {
                        var17 = 0;
                    }
                    byte var18 = 0;
                    if (var5.method3022(46) == 2) {
                        var18 = 1;
                    }
                    ++class10.field104;
                    int var19 = (int) var14;
                    class540 var20 = class257.method1732(true, class148.field2312, class655.field9332);
                    var20.field7707.method1982((byte) -80, var18 << 15 | var19);
                    var20.field7707.method1980(var16 << 16 | var17, (byte) 118);
                    class756.method4211(var20, 116);
                }
                if (~class721.field10121 < -1) {
                    ++class670.field9488;
                    class540 var21 = class257.method1732(true, class459.field6656, class655.field9332);
                    var21.field7707.method1926(class721.field10121 * 3, arg0 ^ -65341);
                    for (int var22 = 0; ~class721.field10121 < ~var22; ++var22) {
                        class62 var23 = class569.field8064[var22];
                        long var24 = (var23.method610(true) - class153.field2376) / 50L;
                        if (var24 > 65535L) {
                            var24 = 65535L;
                        }
                        class153.field2376 = var23.method610(true);
                        var21.field7707.method1926(var23.method614((byte) -37), arg0 ^ -65341);
                        var21.field7707.method1939((int) var24, 1134947720);
                    }
                    class756.method4211(var21, 108);
                }
                if (~class696.field9874 < -1) {
                    --class696.field9874;
                }
                if (class218.field3575 && class696.field9874 <= 0) {
                    class696.field9874 = 20;
                    class218.field3575 = false;
                    ++class711.field10014;
                    class540 var26 = class257.method1732(true, class708.field9975, class655.field9332);
                    var26.field7707.method1925((int) class490.field7077 >> 3, (byte) -112);
                    var26.field7707.method1982((byte) -95, (int) class261.field4064 >> 3);
                    class756.method4211(var26, 113);
                }
                if (!class261.field4065 == class448.field6537) {
                    ++class48.field799;
                    class448.field6537 = class261.field4065;
                    class540 var27 = class257.method1732(true, class97.field1432, class655.field9332);
                    var27.field7707.method1926(!class261.field4065 ? 0 : 1, 65280);
                    class756.method4211(var27, 124);
                }
                if (!class407.field6033) {
                    ++class394.field5877;
                    class540 var28 = class257.method1732(true, class637.field8954, class655.field9332);
                    var28.field7707.method1926(0, 65280);
                    int var29 = var28.field7707.field4534;
                    class301 var30 = class654.field9289.method2287(112);
                    var28.field7707.method1946(1735499792, var30.field4543, 0, var30.field4534);
                    var28.field7707.method1986(-var29 + var28.field7707.field4534, 1);
                    class756.method4211(var28, 124);
                    class407.field6033 = true;
                }
                if (class488.field7062 != null) {
                    if (~class639.field8978 != -3) {
                        if (class639.field8978 == 3) {
                            class613.method3498((byte) 103);
                        }
                    } else {
                        class680.method3789(-120);
                    }
                }
                if (class658.field9364) {
                    class658.field9364 = false;
                } else {
                    class393.field5872 /= 2.0F;
                }
                if (!class18.field189) {
                    class285.field4394 /= 2.0F;
                } else {
                    class18.field189 = false;
                }
                class650.method3659(109);
                if (~class521.field7529 == -11) {
                    class516.method3089(-1);
                    class87.method761(-2);
                    class338.method2156(-31898);
                    ++class618.field8707;
                    if (class618.field8707 > 750) {
                        class498.method3019(7);
                    } else {
                        class65.method635(32);
                        class17.method106((byte) 24);
                        class594.method3398(0);
                        for (int var31 = class422.field6216.method2012(true, true); ~var31 != 0; var31 = class422.field6216.method2012(false, true)) {
                            class390.method2436(var31, -8335);
                            class474.field6885[class636.method3603(class122.field1869++, 31)] = var31;
                        }
                        for (class118 var32 = class483.method2927(arg0 + 65); var32 != null; var32 = class483.method2927(4)) {
                            int var33 = var32.method931((byte) 70);
                            int var34 = var32.method930(true);
                            if (~var33 != -2) {
                                if (var33 == 2) {
                                    class52.field843[var34] = var32.field1813;
                                    class457.field6639[class636.method3603(class17.field186++, 31)] = var34;
                                } else if (~var33 == -4) {
                                    class353 var35 = class65.method638(var34, 1668949296);
                                    if (!var32.field1813.equals(var35.field5231)) {
                                        var35.field5231 = var32.field1813;
                                        class717.method3960(var35, (byte) 71);
                                    }
                                } else if (var33 == 4) {
                                    class353 var36 = class65.method638(var34, arg0 + 1668949357);
                                    int var37 = var32.field1811;
                                    int var38 = var32.field1821;
                                    int var39 = var32.field1817;
                                    if (~var36.field5249 != ~var37 || var36.field5276 != var38 || var36.field5364 != var39) {
                                        var36.field5276 = var38;
                                        var36.field5249 = var37;
                                        var36.field5364 = var39;
                                        class717.method3960(var36, (byte) 90);
                                    }
                                } else if (~var33 == -6) {
                                    class353 var40 = class65.method638(var34, 1668949296);
                                    if (var32.field1811 != var40.field5290 || var32.field1811 == -1) {
                                        var40.field5290 = var32.field1811;
                                        var40.field5242 = 0;
                                        var40.field5245 = 1;
                                        var40.field5266 = 0;
                                        class82 var41 = ~var40.field5290 != 0 ? class83.field1219.method2358((byte) 60, var40.field5290) : null;
                                        if (var41 != null) {
                                            class144.method1111(var40.field5242, var41, (byte) 117);
                                        }
                                        class717.method3960(var40, (byte) 109);
                                    }
                                } else if (var33 != 6) {
                                    if (var33 != 7) {
                                        if (var33 != 8) {
                                            if (~var33 == -10) {
                                                class353 var42 = class65.method638(var34, 1668949296);
                                                if (~var32.field1811 != ~var42.field5328 || ~var32.field1821 != ~var42.field5367) {
                                                    var42.field5367 = var32.field1821;
                                                    var42.field5328 = var32.field1811;
                                                    class717.method3960(var42, (byte) 35);
                                                }
                                            } else if (~var33 != -11) {
                                                if (~var33 == -12) {
                                                    class353 var43 = class65.method638(var34, arg0 + 1668949357);
                                                    var43.field5359 = var43.field5240 = var32.field1811;
                                                    var43.field5248 = 0;
                                                    var43.field5357 = 0;
                                                    var43.field5296 = var43.field5203 = var32.field1821;
                                                    class717.method3960(var43, (byte) 57);
                                                } else if (var33 != 12) {
                                                    if (~var33 != -15) {
                                                        if (var33 == 15) {
                                                            class404.field5991 = var32.field1811;
                                                            class382.field5740 = true;
                                                            class257.field4036 = var32.field1821;
                                                        } else if (~var33 != -17) {
                                                            if (~var33 == -18) {
                                                                class353 var44 = class65.method638(var34, 1668949296);
                                                                var44.field5327 = var32.field1811;
                                                            }
                                                        } else {
                                                            class353 var45 = class65.method638(var34, 1668949296);
                                                            var45.field5252 = var32.field1811;
                                                        }
                                                    } else {
                                                        class353 var46 = class65.method638(var34, 1668949296);
                                                        var46.field5279 = var32.field1811;
                                                    }
                                                } else {
                                                    class353 var47 = class65.method638(var34, 1668949296);
                                                    int var48 = var32.field1811;
                                                    if (var47 != null && ~var47.field5306 == -1) {
                                                        if (~var48 < ~(-var47.field5280 + var47.field5358)) {
                                                            var48 = -var47.field5280 + var47.field5358;
                                                        }
                                                        if (~var48 > -1) {
                                                            var48 = 0;
                                                        }
                                                        if (var47.field5299 != var48) {
                                                            var47.field5299 = var48;
                                                            class717.method3960(var47, (byte) 79);
                                                        }
                                                    }
                                                }
                                            } else {
                                                class353 var49 = class65.method638(var34, arg0 ^ -1668949261);
                                                if (~var32.field1811 != ~var49.field5244 || var32.field1821 != var49.field5227 || var32.field1817 != var49.field5267) {
                                                    var49.field5227 = var32.field1821;
                                                    var49.field5267 = var32.field1817;
                                                    var49.field5244 = var32.field1811;
                                                    class717.method3960(var49, (byte) 49);
                                                }
                                            }
                                        } else {
                                            class353 var50 = class65.method638(var34, 1668949296);
                                            if (var32.field1811 != var50.field5301 || var32.field1821 != var50.field5368 || var32.field1817 != var50.field5253) {
                                                var50.field5301 = var32.field1811;
                                                var50.field5368 = var32.field1821;
                                                var50.field5253 = var32.field1817;
                                                if (~var50.field5328 != 0) {
                                                    if (var50.field5325 <= 0) {
                                                        if (var50.field5258 > 0) {
                                                            var50.field5253 = var50.field5253 * 32 / var50.field5258;
                                                        }
                                                    } else {
                                                        var50.field5253 = var50.field5253 * 32 / var50.field5325;
                                                    }
                                                }
                                                class717.method3960(var50, (byte) 101);
                                            }
                                        }
                                    } else {
                                        class353 var51 = class65.method638(var34, 1668949296);
                                        boolean var52 = ~var32.field1811 == -2;
                                        if (var52 == !var51.field5210) {
                                            var51.field5210 = var52;
                                            class717.method3960(var51, (byte) 87);
                                        }
                                    }
                                } else {
                                    int var53 = var32.field1811;
                                    int var54 = 31 & var53 >> 10;
                                    int var55 = (var53 & 1005) >> 5;
                                    int var56 = 31 & var53;
                                    int var57 = (var54 << 19) - -(var55 << 11) - -(var56 << 3);
                                    class353 var58 = class65.method638(var34, arg0 ^ -1668949261);
                                    if (~var58.field5278 != ~var57) {
                                        var58.field5278 = var57;
                                        class717.method3960(var58, (byte) 106);
                                    }
                                }
                            } else {
                                class472.field6852[var34] = var32.field1811;
                                class292.field4487 |= class618.field8712[var34];
                                class594.field8335[class636.method3603(class736.field10368++, 31)] = var34;
                            }
                        }
                        if (~class230.field3707 != -1) {
                            class405.field6000 += 20;
                            if (class405.field6000 >= 400) {
                                class230.field3707 = 0;
                            }
                        }
                        ++class83.field1223;
                        if (class220.field3588 != null) {
                            ++class124.field1900;
                            if (~class124.field1900 <= -16) {
                                class717.method3960(class220.field3588, (byte) 107);
                                class220.field3588 = null;
                            }
                        }
                        class297.field4516 = null;
                        class730.field10246 = false;
                        class476.field6916 = false;
                        class127.field1985 = null;
                        class373.method2371((class353) null, arg0 + -1, -1, -1);
                        class347.method2213((class353) null, -1, true, -1);
                        if (!class552.field7867) {
                            class618.field8708 = -1;
                        }
                        class109.method891(0);
                        ++class180.field3060;
                        if (client.field6496) {
                            ++class88.field1344;
                            class540 var59 = class257.method1732(true, class531.field7641, class655.field9332);
                            var59.field7707.method1956(class92.field1377 | class292.field4486 << 28 | class36.field358 << 14, (byte) -1);
                            class756.method4211(var59, 109);
                            client.field6496 = false;
                        }
                        while (true) {
                            class700 var60;
                            class353 var61;
                            class353 var62;
                            do {
                                var60 = (class700) class258.field4042.method3466(0);
                                if (var60 == null) {
                                    while (true) {
                                        class700 var63;
                                        class353 var64;
                                        class353 var65;
                                        do {
                                            var63 = (class700) class744.field10416.method3466(arg0 ^ -61);
                                            if (var63 == null) {
                                                while (true) {
                                                    class700 var66;
                                                    class353 var67;
                                                    class353 var68;
                                                    do {
                                                        var66 = (class700) class402.field5970.method3466(0);
                                                        if (var66 == null) {
                                                            if (class297.field4516 == null) {
                                                                class510.field7401 = 0;
                                                            }
                                                            if (class146.field2298 != null) {
                                                                class196.method1473((byte) -93);
                                                            }
                                                            if (~class81.field1173 < -1 && class543.field7749.method455(-14469, 82) && class543.field7749.method455(arg0 + -14408, 81) && class625.field8754 != 0) {
                                                                int var69 = -class625.field8754 + class145.field2251.field9470;
                                                                if (var69 >= 0) {
                                                                    if (var69 > 3) {
                                                                        var69 = 3;
                                                                    }
                                                                } else {
                                                                    var69 = 0;
                                                                }
                                                                class496.method3010(class145.field2251.field1702[0] + class265.field4123, class145.field2251.field1704[0] + class723.field10155, false, var69);
                                                            }
                                                            class304.method2003((byte) 79);
                                                            for (int var70 = 0; var70 < 5; ++var70) {
                                                                int var10002 = class68.field1066[var70]++;
                                                            }
                                                            if (class292.field4487 && ~class470.field6825 > ~(-60000L + class18.method109(-11121))) {
                                                                class418.method2569(1);
                                                            }
                                                            for (class673 var71 = (class673) class696.field9870.method3272(-118); var71 != null; var71 = (class673) class696.field9870.method3274(false)) {
                                                                if (~(-5L + class18.method109(-11121) / 1000L) < ~((long) var71.field9519)) {
                                                                    if (var71.field9524 > 0) {
                                                                        class157.method1177("", 0, var71.field9521 + class641.field9012.method3621(99, class467.field6804), "", "", 1, 5);
                                                                    }
                                                                    if (var71.field9524 == 0) {
                                                                        class157.method1177("", 0, var71.field9521 + class641.field9013.method3621(105, class467.field6804), "", "", 1, 5);
                                                                    }
                                                                    var71.method3610(-25057);
                                                                }
                                                            }
                                                            ++class344.field5097;
                                                            if (class344.field5097 > 500) {
                                                                class344.field5097 = 0;
                                                                int var72 = (int) (8.0D * Math.random());
                                                                if ((1 & var72) == 1) {
                                                                    class603.field8533 += class177.field3032;
                                                                }
                                                                if ((var72 & 2) == 2) {
                                                                    class563.field7974 += class417.field6143;
                                                                }
                                                                if ((var72 & 4) == 4) {
                                                                    class174.field2979 += class117.field1808;
                                                                }
                                                            }
                                                            if (class603.field8533 < -50) {
                                                                class177.field3032 = 2;
                                                            }
                                                            if (class563.field7974 < -55) {
                                                                class417.field6143 = 2;
                                                            }
                                                            if (class603.field8533 > 50) {
                                                                class177.field3032 = -2;
                                                            }
                                                            if (~class174.field2979 > 39) {
                                                                class117.field1808 = 1;
                                                            }
                                                            if (~class563.field7974 < -56) {
                                                                class417.field6143 = -2;
                                                            }
                                                            ++class116.field1792;
                                                            if (~class174.field2979 < -41) {
                                                                class117.field1808 = -1;
                                                            }
                                                            if (~class116.field1792 < -501) {
                                                                class116.field1792 = 0;
                                                                int var73 = (int) (8.0D * Math.random());
                                                                if ((var73 & 1) == 1) {
                                                                    class25.field252 += class577.field8172;
                                                                }
                                                                if (~(var73 & 2) == -3) {
                                                                    class754.field10516 += class515.field7461;
                                                                }
                                                            }
                                                            if (~class25.field252 > 59) {
                                                                class577.field8172 = 2;
                                                            }
                                                            if (~class25.field252 < -61) {
                                                                class577.field8172 = -2;
                                                            }
                                                            if (~class754.field10516 > 19) {
                                                                class515.field7461 = 1;
                                                            }
                                                            if (class754.field10516 > 10) {
                                                                class515.field7461 = -1;
                                                            }
                                                            ++class12.field117;
                                                            if (class12.field117 > 50) {
                                                                ++class651.field9243;
                                                                class540 var74 = class257.method1732(true, class475.field6888, class655.field9332);
                                                                class756.method4211(var74, 119);
                                                            }
                                                            if (class115.field1786) {
                                                                class166.method1241((byte) 24);
                                                                class115.field1786 = false;
                                                            }
                                                            try {
                                                                class683.method3809(0);
                                                                return;
                                                            } catch (IOException var75) {
                                                                class498.method3019(arg0 + 68);
                                                                return;
                                                            }
                                                        }
                                                        var67 = var66.field9902;
                                                        if (~var67.field5352 > -1) {
                                                            break;
                                                        }
                                                        var68 = class65.method638(var67.field5202, 1668949296);
                                                    } while (var68 == null || var68.field5335 == null || var68.field5335.length <= var67.field5352 || var68.field5335[var67.field5352] != var67);
                                                    class464.method2838(var66);
                                                }
                                            }
                                            var64 = var63.field9902;
                                            if (var64.field5352 < 0) {
                                                break;
                                            }
                                            var65 = class65.method638(var64.field5202, 1668949296);
                                        } while (var65 == null || var65.field5335 == null || var65.field5335.length <= var64.field5352 || var65.field5335[var64.field5352] != var64);
                                        class464.method2838(var63);
                                    }
                                }
                                var61 = var60.field9902;
                                if (var61.field5352 < 0) {
                                    break;
                                }
                                var62 = class65.method638(var61.field5202, 1668949296);
                            } while (var62 == null || var62.field5335 == null || var61.field5352 >= var62.field5335.length || var62.field5335[var61.field5352] != var61);
                            class464.method2838(var60);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method1110(String arg0, boolean arg1) {
        ++field2222;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        int var4 = 0;
        if (arg1) {
            return null;
        } else {
            while (var3 > var4) {
                char var5 = arg0.charAt(var4);
                if (var5 == '%' && ~var3 < ~(var4 - -2)) {
                    label101: {
                        char var6 = arg0.charAt(var4 - -1);
                        boolean var7 = false;
                        int var8;
                        if (var6 >= '0' && var6 <= '9') {
                            var8 = var6 + -48;
                        } else if (~var6 <= -98 && var6 <= 'f') {
                            var8 = var6 + -87;
                        } else {
                            if (var6 < 'A' || ~var6 < -71) {
                                var2.append('%');
                                break label101;
                            }
                            var8 = var6 + '\n' + -65;
                        }
                        char var9 = arg0.charAt(var4 - -2);
                        int var10 = var8 * 16;
                        int var11;
                        if (var9 >= '0' && var9 <= '9') {
                            var11 = var9 - '0' + var10;
                        } else if (var9 >= 'a' && ~var9 >= -103) {
                            var11 = var9 + '\n' + -97 + var10;
                        } else {
                            if (~var9 > -66 || ~var9 < -71) {
                                var2.append('%');
                                break label101;
                            }
                            var11 = 10 - (-var9 - -65) + var10;
                        }
                        if (~var11 != -1 && class732.method4081((byte) var11, -51)) {
                            var2.append(class232.method1610(-21630, (byte) var11));
                        }
                        var4 += 2;
                    }
                } else if (var5 != '+') {
                    var2.append(var5);
                } else {
                    var2.append(' ');
                }
                ++var4;
            }
            return var2.toString();
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field2230;
        int[][] var3 = super.field3545.method2996((byte) 126, arg0);
        if (arg1 != -256) {
            this.field2226 = null;
        }
        if (super.field3545.field7147) {
            int[][] var4 = this.method1539(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class626.field8787 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field2226[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field2229 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field2226[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field2229) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field2226[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 > this.field2229) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field2221 * var12 >> 12;
                            var9[var11] = this.field2227 * var14 >> 12;
                            var10[var11] = this.field2220 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
