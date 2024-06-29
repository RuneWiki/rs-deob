import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class314 extends class256 {

    @OriginalMember(owner = "client!am", name = "tc", descriptor = "I")
    public int field5031 = -1;

    @OriginalMember(owner = "client!am", name = "vc", descriptor = "B")
    private byte field5033 = 0;

    @OriginalMember(owner = "client!am", name = "Ec", descriptor = "I")
    public int field5042 = 255;

    @OriginalMember(owner = "client!am", name = "Jc", descriptor = "I")
    public int field5047 = -1;

    @OriginalMember(owner = "client!am", name = "Bc", descriptor = "Z")
    public boolean field5039 = false;

    @OriginalMember(owner = "client!am", name = "yc", descriptor = "I")
    public int field5036 = -1;

    @OriginalMember(owner = "client!am", name = "sc", descriptor = "I")
    public int field5030 = 0;

    @OriginalMember(owner = "client!am", name = "Hc", descriptor = "I")
    public int field5045 = 0;

    @OriginalMember(owner = "client!am", name = "Mc", descriptor = "I")
    public int field5050 = -1;

    @OriginalMember(owner = "client!am", name = "Qc", descriptor = "I")
    public int field5054 = 0;

    @OriginalMember(owner = "client!am", name = "zc", descriptor = "I")
    public int field5037 = 0;

    @OriginalMember(owner = "client!am", name = "Vc", descriptor = "I")
    public int field5059 = 0;

    @OriginalMember(owner = "client!am", name = "wc", descriptor = "B")
    private byte field5034 = 0;

    @OriginalMember(owner = "client!am", name = "ad", descriptor = "I")
    public int field5064 = -1;

    @OriginalMember(owner = "client!am", name = "Rc", descriptor = "I")
    public int field5055 = -1;

    @OriginalMember(owner = "client!am", name = "bd", descriptor = "I")
    public int field5065 = -1;

    @OriginalMember(owner = "client!am", name = "Gc", descriptor = "I")
    public static int field5044 = -1;

    @OriginalMember(owner = "client!am", name = "Kc", descriptor = "Z")
    public static boolean field5048 = true;

    @OriginalMember(owner = "client!am", name = "rc", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!am", name = "uc", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!am", name = "xc", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!am", name = "Ac", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!am", name = "Cc", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!am", name = "Dc", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!am", name = "Fc", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!am", name = "Ic", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!am", name = "Nc", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!am", name = "Oc", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!am", name = "Sc", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!am", name = "Tc", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!am", name = "Uc", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!am", name = "Wc", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!am", name = "Xc", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!am", name = "Yc", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!am", name = "Zc", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!am", name = "ed", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!am", name = "Lc", descriptor = "J")
    public static long field5049;

    @OriginalMember(owner = "client!am", name = "cd", descriptor = "Lgb;")
    public class69 field5066;

    @OriginalMember(owner = "client!am", name = "Pc", descriptor = "Ljava/lang/String;")
    public String field5053;

    @OriginalMember(owner = "client!am", name = "dd", descriptor = "Ljava/lang/String;")
    public String field5067;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIILte;Lmi;IIIIIIIIBII)V")
    private final void method2115(int arg0, int arg1, int arg2, class220 arg3, class94 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, byte arg13, int arg14, int arg15) {
        ++field5046;
        int var17 = arg6 * arg6 + arg14 * arg14;
        if (~var17 <= -17 && arg15 >= var17) {
            int var18 = 2047 & (int) (Math.atan2((double) arg14, (double) arg6) * 325.949D);
            if (arg13 != 51) {
                method2116(-123, 15, (byte) 105, 116, (String) null);
            }
            class94 var19 = class134.method842(var18, arg4, arg11, (byte) -114, super.field4140, super.field4124, super.field4081);
            if (var19 != null) {
                var19.method11(0, arg8, arg0, arg7, arg12, arg10, arg2, arg1, -1L, arg5, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIBILjava/lang/String;)V")
    public static final void method2116(int arg0, int arg1, byte arg2, int arg3, String arg4) {
        class178 var5 = class14.method96(-1, arg1, arg0);
        ++field5040;
        if (var5 != null) {
            if (var5.field2641 != null) {
                class272 var6 = new class272();
                var6.field4327 = arg3;
                var6.field4337 = var5;
                var6.field4340 = var5.field2641;
                var6.field4333 = arg4;
                class160.method994((byte) -112, var6);
            }
            boolean var7 = true;
            if (~var5.field2694 < -1) {
                var7 = class83.method532((byte) -119, var5);
            }
            if (var7) {
                if (client.method2028(var5).method1992((byte) 125, arg3 + -1)) {
                    if (~arg3 == -2) {
                        ++class31.field463;
                        class231.field3614.method809(55, arg2 ^ 118);
                        class231.field3614.method1398(true, arg1);
                        class231.field3614.method1385(arg0, true);
                    }
                    if (~arg3 == -3) {
                        class231.field3614.method809(186, 0);
                        ++class161.field2244;
                        class231.field3614.method1398(true, arg1);
                        class231.field3614.method1385(arg0, true);
                    }
                    if (arg3 == 3) {
                        class231.field3614.method809(38, 0);
                        ++class213.field3217;
                        class231.field3614.method1398(true, arg1);
                        class231.field3614.method1385(arg0, true);
                    }
                    if (~arg3 == -5) {
                        class231.field3614.method809(86, arg2 ^ 118);
                        ++class176.field2490;
                        class231.field3614.method1398(true, arg1);
                        class231.field3614.method1385(arg0, true);
                    }
                    if (arg3 == 5) {
                        ++class176.field2484;
                        class231.field3614.method809(91, 0);
                        class231.field3614.method1398(true, arg1);
                        class231.field3614.method1385(arg0, true);
                    }
                    if (~arg3 == -7) {
                        class231.field3614.method809(225, 0);
                        class231.field3614.method1398(true, arg1);
                        ++class251.field3921;
                        class231.field3614.method1385(arg0, true);
                    }
                    if (arg2 != 118) {
                        method2119(-71, true, true, (byte) -102, false);
                    }
                    if (~arg3 == -8) {
                        ++class242.field3798;
                        class231.field3614.method809(49, arg2 ^ 118);
                        class231.field3614.method1398(true, arg1);
                        class231.field3614.method1385(arg0, true);
                    }
                    if (~arg3 == -9) {
                        class231.field3614.method809(96, 0);
                        ++class136.field1861;
                        class231.field3614.method1398(true, arg1);
                        class231.field3614.method1385(arg0, true);
                    }
                    if (arg3 == 9) {
                        ++class213.field3207;
                        class231.field3614.method809(0, 0);
                        class231.field3614.method1398(true, arg1);
                        class231.field3614.method1385(arg0, true);
                    }
                    if (~arg3 == -11) {
                        class231.field3614.method809(10, 0);
                        ++class128.field1792;
                        class231.field3614.method1398(true, arg1);
                        class231.field3614.method1385(arg0, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)I")
    public final int method1683(int arg0) {
        ++field5060;
        if (this.field5066 != null && ~this.field5066.field980 != 0) {
            return class76.method499((byte) 74, this.field5066.field980).field3122;
        } else {
            if (arg0 >= -57) {
                this.method9();
            }
            return super.method1683(-127);
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)I")
    public final int method1668(byte arg0) {
        ++field5041;
        if (arg0 >= -42) {
            this.method1668((byte) 110);
        }
        return super.field4062;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "()I")
    public final int method9() {
        ++field5043;
        return super.field4126;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIIIJILte;)V")
    public final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class220 arg10) {
        ++field5038;
        if (this.field5066 != null) {
            class195 var13 = ~super.field4133 != 0 && super.field4107 == 0 ? class280.method1815(super.field4133, 89) : null;
            class85 var14 = this.method1685(0);
            boolean var15 = var14.field1211 != 0 || ~var14.field1197 != -1 || ~var14.field1196 != -1 || ~var14.field1208 != -1;
            class195 var16 = super.field4102 == -1 || this.field5039 || super.field4102 == this.method1685(0).field1201 && var13 != null ? null : class280.method1815(super.field4102, 97);
            class94 var17 = this.field5066.method452(super.field4099, 65535, super.field4112, true, var16, super.field4080, super.field4087, super.field4072, var13, super.field4128, var15, super.field4110);
            int var18 = class53.method338(82);
            if (~class292.field4657 != -1 && ~var18 > -51) {
                int var19 = 50 - var18;
                while (~var19 < ~class138.field1890) {
                    class161.field2254[class138.field1890] = new byte[102400];
                    ++class138.field1890;
                }
                while (~var19 > ~class138.field1890) {
                    --class138.field1890;
                    class161.field2254[class138.field1890] = null;
                }
            }
            if (var17 != null) {
                super.field4126 = var17.method9();
                if (class68.field959 && (this.field5066.field980 == -1 || class76.method499((byte) 109, this.field5066.field980).field3193)) {
                    class94 var20 = class183.method1165(1, 0, (byte) -73, 240, var16 != null ? super.field4128 : super.field4099, 160, super.field4081, super.field4124, 0, arg0, var17, super.field4105, var16 == null ? var13 : var16, super.field4140);
                    var20.method11(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class220) null);
                }
                if (class250.field3905 == this) {
                    for (int var21 = class267.field4286.length - 1; var21 >= 0; --var21) {
                        class193 var22 = class267.field4286[var21];
                        if (var22 != null && var22.field2949 != -1) {
                            if (~var22.field2944 == -2 && ~var22.field2943 <= -1 && class88.field1274.length > var22.field2943) {
                                class310 var23 = class88.field1274[var22.field2943];
                                if (var23 != null) {
                                    int var24 = var23.field4081 / 32 + -(class250.field3905.field4081 / 32);
                                    int var25 = var23.field4140 / 32 + -(class250.field3905.field4140 / 32);
                                    this.method2115(arg2, arg7, arg6, (class220) null, var17, arg9, var25, arg3, arg1, arg0, arg5, var22.field2949, arg4, (byte) 51, var24, 360000);
                                }
                            }
                            if (~var22.field2944 == -3) {
                                int var26 = (-class228.field3570 + var22.field2942) * 4 + -(class250.field3905.field4081 / 32) + 2;
                                int var27 = (-class170.field2421 + var22.field2947) * 4 + -(class250.field3905.field4140 / 32) + 2;
                                int var28 = var22.field2953 * 4;
                                int var29 = var28 * var28;
                                this.method2115(arg2, arg7, arg6, (class220) null, var17, arg9, var27, arg3, arg1, arg0, arg5, var22.field2949, arg4, (byte) 51, var26, var29);
                            }
                            if (~var22.field2944 == -11 && var22.field2943 >= 0 && class48.field689.length > var22.field2943) {
                                class314 var30 = class48.field689[var22.field2943];
                                if (var30 != null) {
                                    int var31 = var30.field4081 / 32 - class250.field3905.field4081 / 32;
                                    int var32 = var30.field4140 / 32 + -(class250.field3905.field4140 / 32);
                                    this.method2115(arg2, arg7, arg6, (class220) null, var17, arg9, var32, arg3, arg1, arg0, arg5, var22.field2949, arg4, (byte) 51, var31, 360000);
                                }
                            }
                        }
                    }
                }
                this.method1682(var17, false);
                this.method1684(2, var17, arg0);
                class94 var33 = null;
                if (!this.field5039 && ~super.field4073 != 0 && super.field4086 != -1) {
                    class167 var34 = class291.method1952(0, super.field4073);
                    var33 = var34.method1072(super.field4086, 1, super.field4116, super.field4123);
                    if (var33 != null) {
                        var33.method409(0, -super.field4098, 0);
                        if (var34.field2385) {
                            if (class56.field781 != 0) {
                                var33.method413(class56.field781);
                            }
                            if (~class205.field3063 != -1) {
                                var33.method414(class205.field3063);
                            }
                            if (class107.field1531 != 0) {
                                var33.method409(0, class107.field1531, 0);
                            }
                        }
                    }
                }
                class94 var35 = null;
                if (!this.field5039 && super.field4083 != null) {
                    if (super.field4043 <= class35.field533) {
                        super.field4083 = null;
                    }
                    if (super.field4058 <= class35.field533 && super.field4043 > class35.field533) {
                        if (!(super.field4083 instanceof class158)) {
                            var35 = (class94) super.field4083;
                        } else {
                            var35 = (class94) ((class158) super.field4083).method983(24230);
                        }
                        var35.method409(-super.field4081 + super.field4065, super.field4134 - super.field4124, -super.field4140 + super.field4048);
                        if (~super.field4142 != -513) {
                            if (super.field4142 == 1024) {
                                var35.method432();
                            } else if (super.field4142 == 1536) {
                                var35.method405();
                            }
                        } else {
                            var35.method435();
                        }
                    }
                }
                if (var33 != null) {
                    var17 = ((class66) var17).method430(var33);
                }
                if (var35 != null) {
                    var17 = ((class66) var17).method430(var35);
                }
                this.method1671(var17, var33, 4285);
                var17.field1366 = true;
                var17.method11(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field4041);
                if (var35 != null) {
                    if (super.field4142 == 512) {
                        var35.method405();
                    } else if (super.field4142 == 1024) {
                        var35.method432();
                    } else if (super.field4142 == 1536) {
                        var35.method435();
                    }
                    var35.method409(-super.field4065 + super.field4081, -super.field4134 + super.field4124, -super.field4048 + super.field4140);
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(B)I")
    public final int method1670(byte arg0) {
        int var2 = 6 / ((arg0 - 32) / 58);
        ++field5052;
        return -1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method2117(int arg0, boolean arg1) {
        ++field5051;
        String var3 = "";
        if (class305.field4900 != null) {
            var3 = var3 + class305.field4900[this.field5033];
        }
        if (arg0 != 102400) {
            method2121(89, -43, -71);
        }
        if (class165.field2342 != null && class165.field2342[this.field5033] != -1) {
            class36 var4 = class148.method927(class165.field2342[this.field5033], true);
            if (~var4.field548 != -116) {
                class121.method780(arg0 + -102240, "gdn1", new Throwable());
                class165.field2342[this.field5033] = -1;
            } else {
                var3 = var3 + var4.method246(this.field5034 & 255, false);
            }
        }
        String var5;
        if (!arg1) {
            var5 = var3 + this.field5053;
        } else {
            var5 = var3 + this.field5067;
        }
        if (class225.field3515 != null) {
            var5 = var5 + class225.field3515[this.field5033];
        }
        return var5;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)V")
    public final void method7(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5057;
        if (!super.field4114) {
            if (this.field5066 == null) {
                return;
            }
            class195 var6 = super.field4133 != -1 && super.field4107 == 0 ? class280.method1815(super.field4133, 119) : null;
            class195 var7 = ~super.field4102 == 0 || this.field5039 || ~super.field4102 == ~this.method1685(0).field1201 && var6 != null ? null : class280.method1815(super.field4102, 115);
            class94 var8 = this.field5066.method452(super.field4099, 65535, super.field4112, false, var7, super.field4080, super.field4087, super.field4072, var6, super.field4128, false, super.field4110);
            if (var8 == null) {
                return;
            }
            this.method1671(var8, (class94) null, 4285);
        }
        if (super.field4041 != null) {
            super.field4041.method1442(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lbj;II)V")
    public final void method2118(class215 arg0, int arg1, int arg2) {
        arg0.field3280 = 0;
        int var4 = arg0.method1374((byte) -60);
        int var5 = 1 & var4;
        ++field5063;
        boolean var6 = (var4 & 2) != 0;
        boolean var7 = ~(var4 & 4) != -1;
        int var8 = super.method1683(arg1 ^ -14608);
        this.method1669(false, ((63 & var4) >> 3) + 1);
        this.field5033 = (byte) (var4 >> 6 & 3);
        super.field4081 += (-var8 + this.method1683(arg1 + -14770)) * 64;
        int var9 = -1;
        int[] var10 = new int[12];
        super.field4140 += (this.method1683(-118) + -var8) * 64;
        this.field5034 = arg0.method1350((byte) 79);
        this.field5036 = arg0.method1350((byte) -92);
        this.field5047 = arg0.method1350((byte) -122);
        this.field5054 = 0;
        for (int var11 = 0; var11 < 12; ++var11) {
            int var12 = arg0.method1374((byte) -60);
            if (~var12 == -1) {
                var10[var11] = 0;
            } else {
                int var13 = arg0.method1374((byte) -60);
                int var14 = (var12 << 8) + var13;
                if (~var11 == -1 && ~var14 == -65536) {
                    var9 = arg0.method1379(-108);
                    this.field5054 = arg0.method1374((byte) -60);
                    break;
                }
                if (~var14 <= -32769) {
                    int var25 = class189.field2874[var14 + -32768];
                    var10[var11] = class161.method1003(1073741824, var25);
                    int var26 = class281.method1822((byte) -95, var25).field166;
                    if (var26 != 0) {
                        this.field5054 = var26;
                    }
                } else {
                    var10[var11] = class161.method1003(Integer.MIN_VALUE, var14 + -256);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; ~var16 > -6; ++var16) {
            int var24 = arg0.method1374((byte) -60);
            if (var24 < 0 || class307.field4938[var16].length <= var24) {
                var24 = 0;
            }
            var15[var16] = var24;
        }
        super.field4062 = arg0.method1379(-105);
        this.field5067 = arg0.method1376(arg1 + -14738);
        if (var6) {
            this.field5053 = arg0.method1376(-83);
        } else {
            this.field5053 = this.field5067;
        }
        this.field5059 = arg0.method1374((byte) -60);
        if (!var7) {
            this.field5037 = 0;
            this.field5045 = arg0.method1374((byte) -60);
            this.field5031 = arg0.method1374((byte) -60);
            if (this.field5031 == 255) {
                this.field5031 = -1;
            }
        } else {
            this.field5037 = arg0.method1379(-72);
            this.field5045 = this.field5059;
            this.field5031 = -1;
        }
        int var17 = this.field5030;
        this.field5030 = arg0.method1374((byte) -60);
        if (~this.field5030 != -1) {
            int var18 = this.field5064;
            int var19 = this.field5050;
            int var20 = this.field5055;
            int var21 = this.field5065;
            int var22 = this.field5042;
            this.field5064 = arg0.method1379(-111);
            this.field5050 = arg0.method1379(-117);
            this.field5065 = arg0.method1379(-111);
            this.field5055 = arg0.method1379(-113);
            this.field5042 = arg0.method1374((byte) -60);
            if (this.field5030 != var17 || ~this.field5064 != ~var18 || ~this.field5050 != ~var19 || ~this.field5065 != ~var21 || this.field5055 != var20 || ~this.field5042 != ~var22) {
                class232.method1523(this, arg2, (byte) 93);
            }
        } else {
            class151.method956(true, this, arg2);
        }
        if (this.field5066 == null) {
            this.field5066 = new class69();
        }
        int var23 = this.field5066.field980;
        this.field5066.method455((byte) -32, super.field4062, var9, var5 == 1, var15, var10);
        if (var9 != var23) {
            super.field4081 = super.field4143[0] * 128 + this.method1683(-87) * 64;
            super.field4140 = super.field4053[0] * 128 + 64 * this.method1683(arg1 ^ -14665);
        }
        if (arg1 == 14706) {
            if (super.field4041 != null) {
                super.field4041.method1438();
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZZBZ)Lnh;")
    public static final class305 method2119(int arg0, boolean arg1, boolean arg2, byte arg3, boolean arg4) {
        int var5 = 85 / ((-18 - arg3) / 60);
        ++field5035;
        class142 var6 = null;
        if (class309.field4970 != null) {
            var6 = new class142(arg0, class309.field4970, class206.field3079[arg0], 1000000);
        }
        class150.field2090[arg0] = class129.field1794.method1465(var6, class294.field4687, arg0, (byte) -124);
        if (arg1) {
            class150.field2090[arg0].method529((byte) 123);
        }
        return new class305(class150.field2090[arg0], arg4, arg2);
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(B)V")
    public static final void method2120(byte arg0) {
        if (arg0 != 108) {
            field5044 = 11;
        }
        class78.field1084.method948((byte) 58);
        ++field5058;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(III)V")
    public static final void method2121(int arg0, int arg1, int arg2) {
        ++field5032;
        class39 var3 = class149.method935(-96, arg1, arg2);
        var3.method261(0);
        var3.field598 = arg0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZII)V")
    public final void method2122(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            method2116(1, 126, (byte) -76, -109, (String) null);
        }
        ++field5061;
        super.method1681(this.method1683(-113), arg3, arg1, arg0, (byte) -24);
    }

    @OriginalMember(owner = "client!am", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field5056;
        if (super.field4041 != null) {
            super.field4041.method1444();
        }
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(B)Z")
    public final boolean method1679(byte arg0) {
        ++field5068;
        if (arg0 > -126) {
            this.method2122(-23, false, 57, 64);
        }
        return this.field5066 != null;
    }
}
