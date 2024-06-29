import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class197 extends class504 {

    @OriginalMember(owner = "client!pk", name = "zd", descriptor = "I")
    public int field2299 = -1;

    @OriginalMember(owner = "client!pk", name = "xd", descriptor = "I")
    public int field2297 = -1;

    @OriginalMember(owner = "client!pk", name = "vd", descriptor = "Ldh;")
    public static class320 field2295 = new class320(119, 6);

    @OriginalMember(owner = "client!pk", name = "jd", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!pk", name = "kd", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!pk", name = "ld", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!pk", name = "md", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!pk", name = "nd", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!pk", name = "od", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!pk", name = "pd", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!pk", name = "qd", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!pk", name = "rd", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!pk", name = "sd", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!pk", name = "ud", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!pk", name = "wd", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!pk", name = "yd", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!pk", name = "Ad", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!pk", name = "Bd", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!pk", name = "Cd", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!pk", name = "Dd", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!pk", name = "Ed", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!pk", name = "td", descriptor = "Lsaa;")
    public class326 field2293;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLha;I)Z", line = 4)
    private final boolean method1175(boolean arg0, class58 arg1, int arg2) {
        ++field2290;
        int var4 = arg2;
        class255 var5 = this.method2992(-1);
        class25 var6 = ~super.field7145 != 0 && ~super.field7132 == -1 ? class637.field9158.method1905(102, super.field7145) : null;
        class25 var7 = super.field7147 == -1 || super.field7122 && var6 != null ? null : class637.field9158.method1905(50, super.field7147);
        int var8 = var5.field3093;
        int var9 = var5.field3072;
        if (~var8 != -1 || var9 != 0 || var5.field3095 != 0 || var5.field3097 != 0) {
            arg2 |= 7;
        }
        boolean var10 = ~super.field7169 != -1 && ~class392.field5398 <= ~super.field7124 && super.field7088 > class392.field5398;
        if (var10) {
            arg2 |= 524288;
        }
        int var11 = super.field7166.method4141(-2117887806);
        class470 var12 = super.field7191[0] = this.field2293.method1948(var6, class637.field9158, class722.field10125, var11, class182.field2148, super.field7136, 0, super.field7175, super.field7101, super.field7089, super.field7150, arg2, arg1, var7, super.field7105, super.field7074, super.field7115);
        if (var12 == null) {
            return false;
        } else {
            super.field7156 = var12.method190();
            super.field7170 = var12.method217();
            this.method2993((byte) -61, var12);
            if (var8 == 0 && ~var9 == -1) {
                this.method2999(this.method1128(-1) << 9, 124, var11, 0, this.method1128(-1) << 9, 0);
            } else {
                this.method2999(var8, 73, var11, var5.field3080, var9, var5.field3083);
                if (~super.field7142 != -1) {
                    super.field7191[0].method204(super.field7142);
                }
                if (~super.field7117 != -1) {
                    super.field7191[0].method214(super.field7117);
                }
                if (super.field7134 != 0) {
                    super.field7191[0].method195(0, super.field7134, 0);
                }
            }
            if (var10) {
                var12.method226(super.field7137, super.field7090, super.field7099, super.field7169 & 255);
            }
            if (super.field7084 != -1 && super.field7082 != -1) {
                class342 var13 = class173.field2036.method1221(15719, super.field7084);
                boolean var14 = var13.field4435 == 3 && (var8 != 0 || ~var9 != -1);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (super.field7102 != 0) {
                        var15 = var4 | 5;
                    }
                    if (super.field7103 != 0) {
                        var15 |= 2;
                    }
                    if (super.field7129 != 0) {
                        var15 |= 7;
                    }
                }
                class470 var16 = super.field7191[1] = var13.method2037(super.field7164, var15, arg1, class637.field9158, super.field7138, super.field7082, (byte) -124);
                if (var16 != null) {
                    if (super.field7129 < 0) {
                        if (~super.field7102 != -1) {
                            var16.method211(super.field7102 * 2048);
                        }
                    } else {
                        int var17 = 0;
                        int var18 = 0;
                        int var19 = 0;
                        if (var5.field3070 != null && var5.field3070[super.field7129] != null) {
                            var18 += var5.field3070[super.field7129][1];
                            var19 += var5.field3070[super.field7129][2];
                            var17 += var5.field3070[super.field7129][0];
                        }
                        if (var5.field3099 != null && var5.field3099[super.field7129] != null) {
                            var18 += var5.field3099[super.field7129][1];
                            var19 += var5.field3099[super.field7129][2];
                            var17 += var5.field3099[super.field7129][0];
                        }
                        if (var19 != 0 || var17 != 0) {
                            int var20 = var11;
                            if (super.field7136 != null && super.field7136[super.field7129] != -1) {
                                var20 = super.field7136[super.field7129];
                            }
                            int var21 = 16383 & super.field7102 * 2048 + (var20 - var11);
                            if (var21 != 0) {
                                var16.method211(var21);
                            }
                            int var22 = class260.field3230[var21];
                            int var23 = class260.field3229[var21];
                            int var24 = var17 * var23 + var19 * var22 >> 14;
                            var19 = var19 * var23 + -(var17 * var22) >> 14;
                            var17 = var24;
                        }
                        var16.method195(var17, var18, var19);
                    }
                    if (~super.field7103 != -1) {
                        var16.method195(0, -super.field7103 << 2, 0);
                    }
                    if (var14) {
                        if (super.field7142 != 0) {
                            var16.method204(super.field7142);
                        }
                        if (super.field7117 != 0) {
                            var16.method214(super.field7117);
                        }
                        if (~super.field7134 != -1) {
                            var16.method195(0, super.field7134, 0);
                        }
                    }
                }
            } else {
                super.field7191[1] = null;
            }
            if (~super.field7106 != 0 && ~super.field7133 != 0) {
                class342 var25 = class173.field2036.method1221(15719, super.field7106);
                boolean var26 = ~var25.field4435 == -4 && (var8 != 0 || ~var9 != -1);
                int var27 = var4;
                if (var26) {
                    var27 = var4 | 7;
                } else {
                    if (super.field7094 != 0) {
                        var27 = var4 | 5;
                    }
                    if (super.field7109 != 0) {
                        var27 |= 2;
                    }
                    if (~super.field7100 != -1) {
                        var27 |= 7;
                    }
                }
                class470 var28 = super.field7191[2] = var25.method2032(var27, arg1, super.field7158, super.field7133, class637.field9158, super.field7178, (byte) 105);
                if (var28 != null) {
                    if (~super.field7100 <= -1 && var5.field3070 != null && var5.field3070[super.field7100] != null) {
                        int var29 = 0;
                        int var30 = 0;
                        int var31 = 0;
                        if (var5.field3070 != null && var5.field3070[super.field7100] != null) {
                            var30 += var5.field3070[super.field7100][1];
                            var29 += var5.field3070[super.field7100][0];
                            var31 += var5.field3070[super.field7100][2];
                        }
                        if (var5.field3099 != null && var5.field3099[super.field7100] != null) {
                            var29 += var5.field3099[super.field7100][0];
                            var31 += var5.field3099[super.field7100][2];
                            var30 += var5.field3099[super.field7100][1];
                        }
                        if (var31 != 0 || ~var29 != -1) {
                            int var32 = var11;
                            if (super.field7136 != null && ~super.field7136[super.field7100] != 0) {
                                var32 = super.field7136[super.field7100];
                            }
                            int var33 = super.field7094 * 2048 + var32 + -var11 & 16383;
                            if (var33 != 0) {
                                var28.method211(var33);
                            }
                            int var34 = class260.field3230[var33];
                            int var35 = class260.field3229[var33];
                            int var36 = var29 * var35 + var31 * var34 >> 14;
                            var31 = var31 * var35 + -(var29 * var34) >> 14;
                            var29 = var36;
                        }
                        var28.method195(var29, var30, var31);
                    } else if (~super.field7094 != -1) {
                        var28.method211(super.field7094 * 2048);
                    }
                    if (super.field7109 != 0) {
                        var28.method195(0, -super.field7109 << 2, 0);
                    }
                    if (var26) {
                        if (~super.field7142 != -1) {
                            var28.method204(super.field7142);
                        }
                        if (~super.field7117 != -1) {
                            var28.method214(super.field7117);
                        }
                        if (super.field7134 != 0) {
                            var28.method195(0, super.field7134, 0);
                        }
                    }
                }
            } else {
                super.field7191[2] = null;
            }
            return arg0 ? true : true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "(I)Z", line = 280)
    public final boolean method991(int arg0) {
        ++field2302;
        int var2 = -104 % ((65 - arg0) / 48);
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILsaa;)V", line = 294)
    public final void method1176(int arg0, class326 arg1) {
        this.field2293 = arg1;
        ++field2292;
        if (arg0 > 21) {
            if (super.field7190 != null) {
                super.field7190.method1541();
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(Z)I", line = 310)
    public final int method1177(boolean arg0) {
        ++field2300;
        if (this.field2293 == null) {
            return 0;
        } else {
            if (!arg0) {
                this.field2293 = null;
            }
            return this.field2293.field4197;
        }
    }

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "(I)I", line = 325)
    public final int method1130(int arg0) {
        ++field2286;
        if (arg0 != 0) {
            this.method995(-15, 85, (class58) null, 75);
        }
        if (this.field2293.field4199 != null) {
            class326 var2 = this.field2293.method1939(true, class722.field10125);
            if (var2 != null && ~var2.field4186 != 0) {
                return var2.field4186;
            }
        }
        return this.field2293.field4186;
    }

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "(I)Z", line = 347)
    public final boolean method1178(int arg0) {
        ++field2298;
        if (this.field2293 == null) {
            return false;
        } else {
            return arg0 == 413252706;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIZI)V", line = 364)
    public final void method1179(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        super.field4628 = super.field4633 = (byte) arg2;
        ++field2303;
        if (class728.method4056(arg5, arg3, (byte) 30)) {
            ++super.field4633;
        }
        if (~super.field7145 != 0 && class637.field9158.method1905(59, super.field7145).field261 == 1) {
            super.field7145 = -1;
            super.field7152 = null;
        }
        if (~super.field7084 != 0) {
            class342 var7 = class173.field2036.method1221(15719, super.field7084);
            if (var7.field4418 && ~var7.field4431 != 0 && class637.field9158.method1905(122, var7.field4431).field261 == 1) {
                super.field7084 = -1;
            }
        }
        if (super.field7106 != -1) {
            class342 var8 = class173.field2036.method1221(15719, super.field7106);
            if (var8.field4418 && var8.field4431 != -1 && ~class637.field9158.method1905(120, var8.field4431).field261 == -2) {
                super.field7106 = -1;
            }
        }
        if (!arg4) {
            int var9 = arg3 - super.field7187[0];
            int var10 = -super.field7193[0] + arg5;
            if (~var9 <= 7 && var9 <= 8 && ~var10 <= 7 && var10 <= 8) {
                if (super.field7184 < 9) {
                    ++super.field7184;
                }
                for (int var11 = super.field7184; var11 > 0; --var11) {
                    super.field7187[var11] = super.field7187[var11 + -1];
                    super.field7193[var11] = super.field7193[var11 + -1];
                    super.field7183[var11] = super.field7183[var11 - 1];
                }
                super.field7187[0] = arg3;
                super.field7183[0] = 1;
                super.field7193[0] = arg5;
                return;
            }
        }
        super.field7184 = 0;
        super.field7187[0] = arg3;
        super.field7188 = 0;
        if (arg0 < 3) {
            method1180(21);
        }
        super.field7185 = 0;
        super.field7193[0] = arg5;
        super.field4635 = (super.field7187[0] << 9) + (arg1 << 8);
        super.field4629 = (super.field7193[0] << 9) + (arg1 << 8);
        if (super.field7190 != null) {
            super.field7190.method1541();
        }
    }

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "(I)V", line = 446)
    public static void method1180(int arg0) {
        field2295 = null;
        if (arg0 != -27470) {
            method1180(-83);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILha;I)Z", line = 458)
    public final boolean method995(int arg0, int arg1, class58 arg2, int arg3) {
        ++field2291;
        if (this.field2293 != null && this.method1175(false, arg2, 131072)) {
            class165 var5 = arg2.method422();
            if (arg3 != -1) {
                this.method1130(17);
            }
            int var6 = super.field7166.method4141(-2117887806);
            var5.method1035(var6);
            var5.method1033(super.field4635, super.field4627, super.field4629);
            boolean var7 = false;
            for (int var8 = 0; ~super.field7191.length < ~var8; ++var8) {
                if (super.field7191[var8] != null) {
                    boolean var10000;
                    label47: {
                        if (this.field2293.field4197 <= 0) {
                            label45: {
                                if (~this.field2293.field4167 == 0) {
                                    if (this.field2293.field4227 == 1) {
                                        break label45;
                                    }
                                    var10000 = false;
                                } else {
                                    if (this.field2293.field4167 == 1) {
                                        break label45;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label47;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (!class626.field8994) {
                        var10 = super.field7191[var8].method227(arg0, arg1, var5, var9, this.field2293.field4197);
                    } else {
                        var10 = super.field7191[var8].method191(arg0, arg1, var5, var9, this.field2293.field4197, class586.field8268);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field7191[0] = super.field7191[1] = super.field7191[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLha;Lrr;IIII)V", line = 515)
    public final void method987(boolean arg0, class58 arg1, class361 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == 0) {
            ++field2283;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)I", line = 526)
    public final int method1181(byte arg0) {
        ++field2294;
        int var2 = -40 / ((arg0 - -27) / 39);
        if (this.field2293.field4199 != null) {
            class326 var3 = this.field2293.method1939(true, class722.field10125);
            if (var3 != null && ~var3.field4193 != 0) {
                return var3.field4193;
            }
        }
        return ~this.field2293.field4193 != 0 ? this.field2293.field4193 : super.method1181((byte) 14);
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 547)
    public final void method982(int arg0) {
        ++field2284;
        if (arg0 != 2) {
            this.field2293 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)Z", line = 560)
    public static final boolean method1182(int arg0, int arg1, int arg2) {
        int var3 = 39 % ((47 - arg2) / 58);
        ++field2296;
        return (arg1 & 52) != 0;
    }

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "(I)I", line = 579)
    public final int method1137(int arg0) {
        if (arg0 != 50) {
            this.method982(57);
        }
        ++field2287;
        if (this.field2293.field4199 != null) {
            class326 var2 = this.field2293.method1939(true, class722.field10125);
            if (var2 != null && var2.field4229 != -1) {
                return var2.field4229;
            }
        }
        return this.field2293.field4229;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLha;)Llba;", line = 600)
    public final class547 method994(byte arg0, class58 arg1) {
        ++field2301;
        if (this.field2293 != null && this.method1175(false, arg1, 2048)) {
            class165 var3 = arg1.method422();
            int var4 = super.field7166.method4141(-2117887806);
            var3.method1035(var4);
            class691 var5 = class638.field9170[super.field4628][super.field4635 >> class748.field10430][super.field4629 >> class748.field10430];
            if (var5 != null && var5.field9736 != null) {
                int var6 = -var5.field9736.field2233 + super.field7098;
                super.field7098 = (int) ((float) super.field7098 - (float) var6 / 10.0F);
            } else {
                super.field7098 = (int) ((float) super.field7098 - (float) super.field7098 / 10.0F);
            }
            var3.method1033(super.field4635, super.field4627 + -20 + -super.field7098, super.field4629);
            if (arg0 != -112) {
                this.method1177(true);
            }
            class255 var7 = this.method2992(-1);
            class326 var8 = this.field2293.field4199 == null ? this.field2293 : this.field2293.method1939(true, class722.field10125);
            super.field7189 = false;
            class547 var9 = null;
            if (~class654.field9334.field9869.method37(-124) == -2 && var8.field4171 && var7.field3115) {
                class25 var10 = super.field7145 != -1 && ~super.field7132 == -1 ? class637.field9158.method1905(arg0 + 202, super.field7145) : null;
                class25 var11 = ~super.field7147 == 0 || super.field7122 && var10 != null ? null : class637.field9158.method1905(118, super.field7147);
                class470 var12 = class704.method3950(super.field7142, 65535 & this.field2293.field4157, this.field2293.field4227, super.field7191[0], (byte) -58, arg1, var11 != null ? super.field7150 : super.field7089, this.field2293.field4169 & 255, super.field7117, var4, var11 == null ? var10 : var11, super.field7134, 255 & this.field2293.field4202, 65535 & this.field2293.field4210);
                if (var12 != null) {
                    var9 = class652.method3702(this.method1184(123), -9477, super.field7191.length - -1);
                    super.field7189 = true;
                    arg1.method364(false);
                    if (class626.field8994) {
                        var12.method188(var3, var9.field7870[super.field7191.length], class586.field8268, 0);
                    } else {
                        var12.method228(var3, var9.field7870[super.field7191.length], 0);
                    }
                    arg1.method364(true);
                }
            }
            var3.method1035(var4);
            var3.method1033(super.field4635, super.field4627 - super.field7098 + -5, super.field4629);
            if (var9 == null) {
                var9 = class652.method3702(this.method1184(arg0 ^ -24), -9477, super.field7191.length);
            }
            this.method3000(var3, arg1, false, true, super.field7191);
            if (class626.field8994) {
                for (int var13 = 0; super.field7191.length > var13; ++var13) {
                    if (super.field7191[var13] != null) {
                        super.field7191[var13].method188(var3, var9.field7870[var13], class586.field8268, 0);
                    }
                }
            } else {
                for (int var14 = 0; ~super.field7191.length < ~var14; ++var14) {
                    if (super.field7191[var14] != null) {
                        super.field7191[var14].method228(var3, var9.field7870[var14], 0);
                    }
                }
            }
            if (super.field7190 != null) {
                class713 var15 = super.field7190.method1538();
                if (class626.field8994) {
                    arg1.method402(var15, class586.field8268);
                } else {
                    arg1.method391(var15);
                }
            }
            for (int var16 = 0; super.field7191.length > var16; ++var16) {
                if (super.field7191[var16] != null) {
                    super.field7189 |= super.field7191[var16].method197();
                }
            }
            super.field7077 = class188.field2231;
            super.field7191[0] = super.field7191[1] = super.field7191[2] = null;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(III)V", line = 740)
    public final void method1183(int arg0, int arg1, int arg2) {
        ++field2289;
        int var4 = super.field7187[0];
        int var5 = super.field7193[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (arg1 == 1) {
            ++var4;
            ++var5;
        }
        if (arg1 == 2) {
            ++var4;
        }
        if (arg1 == 3) {
            ++var4;
            --var5;
        }
        if (arg1 == 4) {
            --var5;
        }
        if (~arg1 == -6) {
            --var5;
            --var4;
        }
        if (~arg1 == -7) {
            --var4;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        if (super.field7145 != -1 && ~class637.field9158.method1905(56, super.field7145).field261 == -2) {
            super.field7145 = -1;
            super.field7152 = null;
        }
        if (~super.field7084 != 0) {
            class342 var6 = class173.field2036.method1221(15719, super.field7084);
            if (var6.field4418 && var6.field4431 != -1 && class637.field9158.method1905(125, var6.field4431).field261 == 1) {
                super.field7084 = -1;
            }
        }
        if (super.field7106 != -1) {
            class342 var7 = class173.field2036.method1221(15719, super.field7106);
            if (var7.field4418 && ~var7.field4431 != 0 && ~class637.field9158.method1905(92, var7.field4431).field261 == -2) {
                super.field7106 = -1;
            }
        }
        if (super.field7184 < 9) {
            ++super.field7184;
        }
        if (arg0 == -15651) {
            for (int var8 = super.field7184; ~var8 < -1; --var8) {
                super.field7187[var8] = super.field7187[var8 + -1];
                super.field7193[var8] = super.field7193[var8 + -1];
                super.field7183[var8] = super.field7183[var8 - 1];
            }
            super.field7187[0] = var4;
            super.field7183[0] = (byte) arg2;
            super.field7193[0] = var5;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lha;I)V", line = 839)
    public final void method990(class58 arg0, int arg1) {
        ++field2285;
        if (this.field2293 != null) {
            if (super.field7192 || this.method1175(false, arg0, 0)) {
                class165 var3 = arg0.method422();
                int var4 = 6 / ((arg1 - -2) / 62);
                var3.method1035(super.field7166.method4141(-2117887806));
                var3.method1033(super.field4635, super.field4627 - 20, super.field4629);
                this.method3000(var3, arg0, super.field7192, true, super.field7191);
                super.field7191[0] = super.field7191[1] = super.field7191[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "(I)Z", line = 868)
    private final boolean method1184(int arg0) {
        ++field2288;
        return arg0 <= 109 ? false : this.field2293.field4160;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(ILha;)Llca;", line = 879)
    public final class642 method983(int arg0, class58 arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field2304;
            return null;
        }
    }
}
