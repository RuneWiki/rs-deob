import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class180 extends class241 {

    @OriginalMember(owner = "client!ib", name = "Xb", descriptor = "I")
    public int field3121 = 0;

    @OriginalMember(owner = "client!ib", name = "Rb", descriptor = "I")
    public int field3115 = 0;

    @OriginalMember(owner = "client!ib", name = "Wb", descriptor = "I")
    public int field3120 = 0;

    @OriginalMember(owner = "client!ib", name = "bc", descriptor = "I")
    public int field3125 = 0;

    @OriginalMember(owner = "client!ib", name = "cc", descriptor = "S")
    private short field3126 = 0;

    @OriginalMember(owner = "client!ib", name = "Pb", descriptor = "I")
    public int field3113 = -1;

    @OriginalMember(owner = "client!ib", name = "Mb", descriptor = "S")
    private short field3110 = 0;

    @OriginalMember(owner = "client!ib", name = "Vb", descriptor = "I")
    public int field3119 = -1;

    @OriginalMember(owner = "client!ib", name = "hc", descriptor = "I")
    public int field3131 = 0;

    @OriginalMember(owner = "client!ib", name = "ic", descriptor = "I")
    public int field3132 = -1;

    @OriginalMember(owner = "client!ib", name = "Qb", descriptor = "I")
    public int field3114 = -1;

    @OriginalMember(owner = "client!ib", name = "ec", descriptor = "I")
    public int field3128 = 0;

    @OriginalMember(owner = "client!ib", name = "mc", descriptor = "Z")
    public boolean field3136 = false;

    @OriginalMember(owner = "client!ib", name = "oc", descriptor = "I")
    public int field3138 = -1;

    @OriginalMember(owner = "client!ib", name = "Ub", descriptor = "[[S")
    public static short[][] field3118 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ib", name = "lc", descriptor = "Lia;")
    public static class257 field3135 = class28.method234(85, "::clientdrop");

    @OriginalMember(owner = "client!ib", name = "Zb", descriptor = "I")
    public static int field3123 = 0;

    @OriginalMember(owner = "client!ib", name = "Jb", descriptor = "I")
    public static int field3107 = -1;

    @OriginalMember(owner = "client!ib", name = "Lb", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ib", name = "Nb", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!ib", name = "Ob", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!ib", name = "Sb", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!ib", name = "Tb", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!ib", name = "Yb", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ib", name = "ac", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ib", name = "dc", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ib", name = "gc", descriptor = "I")
    public int field3130;

    @OriginalMember(owner = "client!ib", name = "jc", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ib", name = "kc", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!ib", name = "pc", descriptor = "I")
    public int field3139;

    @OriginalMember(owner = "client!ib", name = "Ib", descriptor = "Lei;")
    public class168 field3106;

    @OriginalMember(owner = "client!ib", name = "fc", descriptor = "Lte;")
    public static class184 field3129;

    @OriginalMember(owner = "client!ib", name = "nc", descriptor = "Lvb;")
    public static class226 field3137;

    @OriginalMember(owner = "client!ib", name = "Kb", descriptor = "Lth;")
    public class244 field3108;

    @OriginalMember(owner = "client!ib", name = "qc", descriptor = "Lia;")
    public class257 field3140;

    @OriginalMember(owner = "client!ib", name = "Hb", descriptor = "[S")
    public static short[] field3105;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIILij;IJ)Z")
    public static final boolean method1234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class166 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class225.method1472(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIBIILei;IIII)V")
    private final void method1235(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, class168 arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field3124;
        int var14 = arg3 * arg3 + arg6 * arg6;
        if (~var14 <= -17 && ~var14 >= -360001) {
            int var15 = 2047 & (int) (Math.atan2((double) arg3, (double) arg6) * 325.949D);
            if (arg5 != 83) {
                this.field3125 = -86;
            }
            class168 var16 = class162.method1121(super.field4143, var15, super.field4121, arg9, super.field4177, arg8, -32);
            if (var16 != null) {
                var16.method3(0, arg0, arg1, arg10, arg2, arg12, arg4, arg7, -1L);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3109;
        if (this.field3108 != null) {
            class31 var11 = super.field4129 != -1 && ~super.field4144 == -1 ? class186.method1263(0, super.field4129) : null;
            class31 var12 = super.field4170 == -1 || this.field3136 || ~super.field4170 == ~super.field4165 && var11 != null ? null : class186.method1263(0, super.field4170);
            class168 var13 = this.field3108.method1602(super.field4120, var12, super.field4187, 93, var11);
            if (var13 != null) {
                super.field4151 = var13.method2();
                if (class19.field399) {
                    class168 var14 = class126.method880(0, 160, 240, var12 == null ? var11 : var12, super.field4121, super.field4177, super.field4142, var13, -1, 0, 1, arg0, var12 == null ? super.field4120 : super.field4187, super.field4143);
                    var14.method3(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                if (class137.field2441 == this) {
                    for (int var15 = class156.field2719.length + -1; ~var15 <= -1; --var15) {
                        class12 var16 = class156.field2719[var15];
                        if (var16 != null && var16.field239 != -1) {
                            if (var16.field224 == 1 && ~var16.field222 <= -1 && ~var16.field222 > ~class92.field1758.length) {
                                class197 var17 = class92.field1758[var16.field222];
                                if (var17 != null) {
                                    int var18 = var17.field4143 / 32 + -(class137.field2441.field4143 / 32);
                                    int var19 = var17.field4177 / 32 - class137.field2441.field4177 / 32;
                                    this.method1235(arg1, arg2, arg4, var19, arg6, (byte) 83, var18, arg7, var13, var16.field239, arg3, arg0, arg5);
                                }
                            }
                            if (~var16.field224 == -3) {
                                int var20 = (-class231.field3878 + var16.field237) * 4 + 2 + -(class137.field2441.field4143 / 32);
                                int var21 = (-class244.field4232 + var16.field223) * 4 + 2 + -(class137.field2441.field4177 / 32);
                                this.method1235(arg1, arg2, arg4, var21, arg6, (byte) 83, var20, arg7, var13, var16.field239, arg3, arg0, arg5);
                            }
                            if (var16.field224 == 10 && ~var16.field222 <= -1 && ~var16.field222 > ~class55.field1180.length) {
                                class180 var22 = class55.field1180[var16.field222];
                                if (var22 != null) {
                                    int var23 = var22.field4177 / 32 + -(class137.field2441.field4177 / 32);
                                    int var24 = var22.field4143 / 32 + -(class137.field2441.field4143 / 32);
                                    this.method1235(arg1, arg2, arg4, var23, arg6, (byte) 83, var24, arg7, var13, var16.field239, arg3, arg0, arg5);
                                }
                            }
                        }
                    }
                }
                int var25 = 0;
                int var26 = 0;
                int var27 = 0;
                if (this.field3110 != 0 && this.field3126 != 0) {
                    int var28 = class101.field1871[arg0];
                    int var29 = class101.field1872[arg0];
                    short var30 = this.field3110;
                    short var31 = this.field3126;
                    int var32 = -var30 / 2;
                    int var33 = -var31 / 2;
                    int var34 = var29 * var33 - -(var28 * var32) >> 16;
                    int var35 = var28 * var33 + -(var29 * var32) >> 16;
                    int var36 = -var31 / 2;
                    int var37 = class109.method803(class189.field3261, super.field4143 - -var35, (byte) 114, super.field4177 + var34);
                    int var38 = var30 / 2;
                    int var39 = var28 * var36 + -(var29 * var38) >> 16;
                    int var40 = var28 * var38 + var29 * var36 >> 16;
                    int var41 = -var30 / 2;
                    int var42 = var31 / 2;
                    int var43 = class109.method803(class189.field3261, super.field4143 + var39, (byte) -127, super.field4177 - -var40);
                    int var44 = var28 * var42 + -(var29 * var41) >> 16;
                    int var45 = var31 / 2;
                    int var46 = var30 / 2;
                    int var47 = var28 * var45 + -(var29 * var46) >> 16;
                    int var48 = var28 * var46 + var29 * var45 >> 16;
                    int var49 = var28 * var41 + var29 * var42 >> 16;
                    int var50 = var37 < var43 ? var37 : var43;
                    int var51 = class109.method803(class189.field3261, super.field4143 + var44, (byte) 124, super.field4177 + var49);
                    int var52 = class109.method803(class189.field3261, super.field4143 - -var47, (byte) -53, super.field4177 + var48);
                    int var53 = var37 + var52;
                    int var54 = var52 <= var43 ? var52 : var43;
                    int var55 = ~var51 <= ~var52 ? var52 : var51;
                    int var56 = ~var51 >= ~var37 ? var51 : var37;
                    if (var43 + var51 < var53) {
                        var53 = var43 + var51;
                    }
                    var25 = (int) (325.95D * Math.atan2((double) (-var55 + var50), (double) var31)) & 2047;
                    if (var25 != 0) {
                        var13.method1143(var25);
                    }
                    var26 = 2047 & (int) (325.95D * Math.atan2((double) (-var54 + var56), (double) var30));
                    if (~var26 != -1) {
                        var13.method1151(var26);
                    }
                    var27 = (var53 >> 1) + -super.field4121;
                    if (~var27 != -1) {
                        var13.method1149(0, var27, 0);
                    }
                }
                class168 var57 = null;
                if (!this.field3136 && ~super.field4172 != 0 && super.field4150 != -1) {
                    class219 var58 = class152.method1059(super.field4172, true);
                    var57 = var58.method1447(73, super.field4150);
                    if (var57 != null) {
                        var57.method1149(0, -super.field4156, 0);
                        if (var58.field3704) {
                            if (var25 != 0) {
                                var57.method1143(var25);
                            }
                            if (~var26 != -1) {
                                var57.method1151(var26);
                            }
                            if (var27 != 0) {
                                var57.method1149(0, var27, 0);
                            }
                        }
                    }
                }
                class168 var59 = null;
                if (!this.field3136 && this.field3106 != null) {
                    if (class7.field153 >= this.field3128) {
                        this.field3106 = null;
                    }
                    if (~class7.field153 <= ~this.field3131 && ~this.field3128 < ~class7.field153) {
                        var59 = this.field3106;
                        var59.method1149(-super.field4177 + this.field3116, -super.field4121 + this.field3117, this.field3134 - super.field4143);
                        if (~super.field4125 != -513) {
                            if (~super.field4125 != -1025) {
                                if (~super.field4125 == -1537) {
                                    var59.method1152();
                                }
                            } else {
                                var59.method1145();
                            }
                        } else {
                            var59.method1148();
                        }
                    }
                }
                if (var57 != null) {
                    var13 = ((class232) var13).method1510(var57);
                }
                if (var59 != null) {
                    var13 = ((class232) var13).method1510(var59);
                }
                var13.field2907 = true;
                var13.method3(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var59 != null) {
                    if (~super.field4125 != -513) {
                        if (~super.field4125 != -1025) {
                            if (~super.field4125 == -1537) {
                                var59.method1148();
                            }
                        } else {
                            var59.method1145();
                        }
                    } else {
                        var59.method1152();
                    }
                    var59.method1149(-this.field3116 + super.field4177, super.field4121 - this.field3117, -this.field3134 + super.field4143);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)Z")
    public final boolean method1236(int arg0) {
        ++field3122;
        if (arg0 != 0) {
            this.field3139 = 116;
        }
        return this.field3108 != null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLk;)V")
    public final void method1237(boolean arg0, class152 arg1) {
        ++field3133;
        arg1.field2677 = 0;
        int var3 = arg1.method1051((byte) -47);
        if ((var3 & 2) == 2) {
            this.field3110 = (short) (arg1.method1051((byte) -48) << 2);
            this.field3126 = (short) (arg1.method1051((byte) -53) << 2);
        } else {
            this.field3126 = 0;
            this.field3110 = 0;
        }
        super.field4128 = (var3 >> 3) - -1;
        this.field3119 = arg1.method1060((byte) -58);
        int var4 = var3 & 1;
        boolean var5 = ~(var3 & 4) != -1;
        this.field3138 = arg1.method1060((byte) -58);
        int[] var6 = new int[12];
        int var7 = -1;
        this.field3120 = 0;
        for (int var8 = 0; var8 < 12; ++var8) {
            int var9 = arg1.method1051((byte) 117);
            if (var9 == 0) {
                var6[var8] = 0;
            } else {
                int var10 = arg1.method1051((byte) -57);
                int var11 = (var9 << 8) + var10;
                if (~var8 == -1 && var11 == 65535) {
                    var7 = arg1.method1063(-17162);
                    break;
                }
                if (~var11 <= -32769) {
                    int var19 = class226.field3802[var11 + -32768];
                    var6[var8] = class198.method1332(1073741824, var19);
                    int var20 = class156.method1090(var19, 0).field283;
                    if (~var20 != -1) {
                        this.field3120 = var20;
                    }
                } else {
                    var6[var8] = class198.method1332(var11 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var12 = new int[5];
        for (int var13 = 0; var13 < 5; ++var13) {
            int var18 = arg1.method1051((byte) -87);
            if (~var18 > -1 || ~var18 <= ~class144.field2526[var13].length) {
                var18 = 0;
            }
            var12[var13] = var18;
        }
        super.field4165 = arg1.method1063(-17162);
        if (super.field4165 == 65535) {
            super.field4165 = -1;
        }
        super.field4124 = arg1.method1063(-17162);
        if (super.field4124 == 65535) {
            super.field4124 = -1;
        }
        super.field4178 = super.field4124;
        super.field4145 = arg1.method1063(-17162);
        if (super.field4145 == 65535) {
            super.field4145 = -1;
        }
        super.field4149 = arg1.method1063(-17162);
        if (super.field4149 == 65535) {
            super.field4149 = -1;
        }
        super.field4183 = arg1.method1063(-17162);
        if (super.field4183 == 65535) {
            super.field4183 = -1;
        }
        super.field4176 = arg1.method1063(-17162);
        if (super.field4176 == 65535) {
            super.field4176 = -1;
        }
        super.field4135 = arg1.method1063(-17162);
        if (~super.field4135 == -65536) {
            super.field4135 = -1;
        }
        this.field3140 = class199.method1334((byte) -104, arg1.method1049(127)).method1717(-106);
        this.field3115 = arg1.method1051((byte) 97);
        if (var5) {
            this.field3121 = arg1.method1063(-17162);
        } else {
            this.field3121 = 0;
        }
        int var14 = this.field3125;
        this.field3125 = arg1.method1051((byte) -110);
        if (~this.field3125 != -1) {
            int var15 = this.field3113;
            int var16 = this.field3114;
            int var17 = this.field3132;
            this.field3113 = arg1.method1063(-17162);
            this.field3114 = arg1.method1063(-17162);
            this.field3132 = arg1.method1063(-17162);
            if (~this.field3125 != ~var14 || this.field3113 != var15 || this.field3114 != var16 || this.field3132 != var17) {
                class18.method168(false, this);
            }
        } else {
            class170.method1168(true, this);
        }
        if (!arg0) {
            if (this.field3108 == null) {
                this.field3108 = new class244();
            }
            this.field3108.method1606(var7, var12, 21764, var6, ~var4 == -2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()I")
    public final int method2() {
        ++field3127;
        return super.field4151;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public static void method1238(byte arg0) {
        field3135 = null;
        if (arg0 >= -84) {
            method1234(101, 51, -32, -68, 28, 97, (class166) null, 123, -66L);
        }
        field3105 = null;
        field3118 = null;
        field3129 = null;
        field3137 = null;
    }
}
