import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class279 extends class23 {

    @OriginalMember(owner = "client!sg", name = "Tc", descriptor = "I")
    public int field4154 = -1;

    @OriginalMember(owner = "client!sg", name = "ad", descriptor = "I")
    public int field4161 = -1;

    @OriginalMember(owner = "client!sg", name = "Gc", descriptor = "F")
    public static float field4141 = 1.0F;

    @OriginalMember(owner = "client!sg", name = "Mc", descriptor = "I")
    public static int field4147 = 0;

    @OriginalMember(owner = "client!sg", name = "Fc", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!sg", name = "Hc", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!sg", name = "Ic", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!sg", name = "Jc", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!sg", name = "Kc", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!sg", name = "Lc", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!sg", name = "Nc", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!sg", name = "Oc", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!sg", name = "Pc", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!sg", name = "Qc", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!sg", name = "Rc", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!sg", name = "Sc", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!sg", name = "Uc", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!sg", name = "Vc", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!sg", name = "Xc", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!sg", name = "Yc", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!sg", name = "Zc", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!sg", name = "bd", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!sg", name = "cd", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!sg", name = "ed", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!sg", name = "Wc", descriptor = "Lti;")
    public class311 field4157;

    @OriginalMember(owner = "client!sg", name = "dd", descriptor = "[Laa;")
    public static class343[] field4164;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(B)I", line = 4)
    public final int method140(byte arg0) {
        int var2 = -18 % ((-71 - arg0) / 32);
        ++field4155;
        if (this.field4157.field4631 != null) {
            class311 var3 = this.field4157.method1972(class84.field1335, (byte) 121);
            if (var3 != null && ~var3.field4636 != 0) {
                return var3.field4636;
            }
        }
        return ~this.field4157.field4636 == 0 ? super.method140((byte) 64) : this.field4157.field4636;
    }

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "(I)Z", line = 27)
    private final boolean method1790(int arg0) {
        if (arg0 != -1) {
            return true;
        } else {
            ++field4152;
            return this.field4157.field4576;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lqa;B)V", line = 38)
    public final void method552(class167 arg0, byte arg1) {
        ++field4160;
        if (this.field4157 != null) {
            if (super.field339 || this.method1791(0, 0, arg0)) {
                this.method122(arg0, super.field334, super.field339, -19509);
                if (arg1 <= -119) {
                    super.field334[0] = super.field334[1] = super.field334[2] = super.field334[3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)Z", line = 60)
    public final boolean method556(int arg0) {
        if (arg0 != -1) {
            this.method128((byte) -88);
        }
        ++field4142;
        return false;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)I", line = 72)
    public final int method129(int arg0) {
        ++field4143;
        int var2 = 46 / ((arg0 - 8) / 59);
        if (this.field4157.field4631 != null) {
            class311 var3 = this.field4157.method1972(class84.field1335, (byte) -103);
            if (var3 != null && var3.field4648 != -1) {
                return var3.field4648;
            }
        }
        return this.field4157.field4648;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)I", line = 92)
    public final int method128(byte arg0) {
        ++field4151;
        if (arg0 != -25) {
            this.field4154 = -115;
        }
        if (this.field4157.field4631 != null) {
            class311 var2 = this.field4157.method1972(class84.field1335, (byte) 95);
            if (var2 != null && ~var2.field4651 != 0) {
                return var2.field4651;
            }
        }
        return this.field4157.field4651;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILqa;)Z", line = 114)
    private final boolean method1791(int arg0, int arg1, class167 arg2) {
        ++field4156;
        int var4 = arg0;
        class236 var5 = this.method139((byte) -92);
        class183 var6 = super.field274 != -1 && ~super.field261 == -1 ? class96.field1526.method2717(-92, super.field274) : null;
        class183 var7 = ~super.field248 == 0 || super.field240 && var6 != null ? null : class96.field1526.method2717(-91, super.field248);
        int var8 = var5.field3548;
        int var9 = var5.field3509;
        if (~var8 != -1 || var9 != 0 || ~var5.field3512 != -1 || var5.field3551 != 0) {
            arg0 |= 7;
        }
        boolean var10 = ~super.field265 != -1 && ~super.field257 >= ~class24.field349 && ~super.field296 < ~class24.field349;
        if (var10) {
            arg0 |= 524288;
        }
        class336 var11 = super.field334[0] = this.field4157.method1973(super.field251, (byte) 74, class96.field1526, arg2, super.field313, var6, super.field316, super.field256, var7, arg0, super.field320, class84.field1335, super.field243, class147.field2266, super.field234);
        if (var11 == null) {
            return false;
        } else {
            super.field295 = var11.method1130();
            this.method141(true, var11);
            int var12 = super.field318.method650((byte) -6);
            if (arg1 == var8 && var9 == 0) {
                this.method125(this.method135((byte) 72) << 7, 0, (byte) 49, this.method135((byte) 72) << 7, var12, 0);
            } else {
                this.method125(var8, var5.field3519, (byte) 49, var9, var12, var5.field3513);
                if (~super.field247 != -1) {
                    super.field334[0].method1135(super.field247);
                }
                if (~super.field280 != -1) {
                    super.field334[0].method1145(super.field280);
                }
                if (super.field244 != 0) {
                    super.field334[0].method1167(0, super.field244, 0);
                }
            }
            if (var10) {
                var11.method1146(super.field276, super.field268, super.field253, 255 & super.field265);
            }
            if (~super.field286 != 0 && ~super.field283 != 0) {
                class394 var13 = class69.field1133.method1312(super.field286, (byte) -39);
                boolean var14 = ~var13.field5606 == -4 && (var8 != 0 || var9 != 0);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (~super.field277 != -1) {
                        var15 = var4 | 5;
                    }
                    if (super.field271 != 0) {
                        var15 |= 2;
                    }
                }
                class336 var16 = super.field334[1] = var13.method2378(arg2, -19750, class96.field1526, super.field255, var15, super.field283, super.field293);
                if (var16 != null) {
                    if (~super.field271 != -1) {
                        var16.method1167(0, -super.field271 << 0, 0);
                    }
                    if (super.field277 != 0) {
                        var16.method1151(super.field277 * 2048);
                    }
                    if (var14) {
                        if (~super.field247 != -1) {
                            var16.method1135(super.field247);
                        }
                        if (super.field280 != 0) {
                            var16.method1145(super.field280);
                        }
                        if (super.field244 != 0) {
                            var16.method1167(0, super.field244, 0);
                        }
                    }
                }
            } else {
                super.field334[1] = null;
            }
            if (~super.field250 != 0 && super.field259 != -1) {
                class394 var17 = class69.field1133.method1312(super.field250, (byte) -39);
                boolean var18 = ~var17.field5606 == -4 && (~var8 != -1 || var9 != 0);
                int var19 = var4;
                if (!var18) {
                    if (super.field302 != 0) {
                        var19 = var4 | 5;
                    }
                    if (~super.field258 != -1) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class336 var20 = super.field334[3] = var17.method2380(class96.field1526, var19, (byte) 114, arg2, super.field309, super.field262, super.field259);
                if (var20 != null) {
                    if (~super.field258 != -1) {
                        var20.method1167(0, -super.field258 << 0, 0);
                    }
                    if (~super.field302 != -1) {
                        var20.method1151(super.field302 * 2048);
                    }
                    if (var18) {
                        if (~super.field247 != -1) {
                            var20.method1135(super.field247);
                        }
                        if (~super.field280 != -1) {
                            var20.method1145(super.field280);
                        }
                        if (super.field244 != 0) {
                            var20.method1167(0, super.field244, 0);
                        }
                    }
                }
            } else {
                super.field334[3] = null;
            }
            super.field334[2] = null;
            if (super.field341 != null) {
                if (~super.field341.field3213 >= ~class24.field349) {
                    super.field341 = null;
                } else if (class24.field349 >= super.field341.field3206) {
                    class336 var21 = super.field341.method1431(arg2, var4 | 7, arg1);
                    if (var21 != null) {
                        var21.method1167(super.field341.field3215 - super.field6961, -super.field6954 + super.field341.field3221, -super.field6965 + super.field341.field3207);
                        if (var12 != 0) {
                            var21.method1151(var12);
                        }
                        super.field334[2] = var21;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)I", line = 310)
    public final int method1792(boolean arg0) {
        if (arg0) {
            field4147 = 120;
        }
        ++field4149;
        return super.field295;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lti;I)V", line = 322)
    public final void method1793(class311 arg0, int arg1) {
        this.field4157 = arg0;
        ++field4159;
        if (arg1 >= -106) {
            this.field4154 = -73;
        }
        if (super.field337 != null) {
            super.field337.method818();
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILqa;)Lnj;", line = 337)
    public final class166 method554(int arg0, class167 arg1) {
        ++field4163;
        if (this.field4157 != null && this.method1791(2048, arg0, arg1)) {
            class15 var3 = arg1.method312();
            int var4 = super.field318.method650((byte) -6);
            var3.method41(var4);
            var3.method37(super.field6961, super.field6954, super.field6965);
            class236 var5 = this.method139((byte) 63);
            class311 var6 = this.field4157.field4631 == null ? this.field4157 : this.field4157.method1972(class84.field1335, (byte) 119);
            if (class220.field3371.field2562 && var6.field4612 && var5.field3532) {
                class183 var7 = super.field274 != -1 && ~super.field261 == -1 ? class96.field1526.method2717(arg0 + -105, super.field274) : null;
                class183 var8 = super.field248 == -1 || super.field240 && var7 != null ? null : class96.field1526.method2717(-117, super.field248);
                int var9 = 0;
                if (super.field245 != 0) {
                    var9 = this.method133(arg0 ^ -84);
                }
                class336 var10 = class466.method2767(var8 == null ? var7 : var8, var8 == null ? super.field320 : super.field256, 255 & this.field4157.field4595, var9, super.field247, this.field4157.field4620, arg1, var4, super.field334[0], this.field4157.field4624 & 65535, super.field244, super.field280, 255 & this.field4157.field4575, this.field4157.field4593 & 65535, 1);
                if (var10 != null) {
                    float var11 = arg1.method272();
                    float var12 = arg1.method212();
                    arg1.method273(false);
                    arg1.method221(var11, var12 + -150.0F);
                    var10.method1142(var3, (class48) null, 0);
                    arg1.method221(var11, var12);
                    arg1.method273(true);
                }
            }
            class166 var13 = null;
            if (this.method1790(-1)) {
                var13 = class392.method2363(3317, super.field334.length);
            }
            if (super.field337 != null) {
                class300 var14 = super.field337.method819();
                arg1.method274(super.field334, var14, var3, var13 == null ? null : var13.field2497, 0);
            } else {
                arg1.method323(super.field334, var3, var13 == null ? null : var13.field2497, 0);
            }
            this.method122(arg1, super.field334, false, -19509);
            if (super.field334[2] != null) {
                if (~var4 != -1) {
                    super.field334[2].method1151(var4);
                }
                super.field334[2].method1167(-super.field341.field3215 + super.field6961, -super.field341.field3221 + super.field6954, super.field6965 - super.field341.field3207);
            }
            super.field334[arg0] = super.field334[1] = super.field334[2] = super.field334[3] = null;
            super.field235 = class110.field1635;
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "(I)V", line = 415)
    public static void method1794(int arg0) {
        int var1 = -5 / ((-28 - arg0) / 47);
        field4164 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZBIII)V", line = 424)
    public final void method1795(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5) {
        super.field6956 = (byte) arg4;
        ++field4145;
        if (~super.field274 != 0 && class96.field1526.method2717(-127, super.field274).field2706 == 1) {
            super.field274 = -1;
        }
        if (super.field286 != -1) {
            class394 var7 = class69.field1133.method1312(super.field286, (byte) -39);
            if (var7.field5607 && ~var7.field5596 != 0 && ~class96.field1526.method2717(-117, var7.field5596).field2706 == -2) {
                super.field286 = -1;
            }
        }
        if (~super.field250 != 0) {
            class394 var8 = class69.field1133.method1312(super.field250, (byte) -39);
            if (var8.field5607 && var8.field5596 != -1 && ~class96.field1526.method2717(-112, var8.field5596).field2706 == -2) {
                super.field250 = -1;
            }
        }
        if (!arg1) {
            int var9 = -super.field343[0] + arg3;
            int var10 = -super.field344[0] + arg5;
            if (var9 >= -8 && ~var9 >= -9 && ~var10 <= 7 && ~var10 >= -9) {
                if (~super.field333 > -10) {
                    ++super.field333;
                }
                for (int var11 = super.field333; var11 > 0; --var11) {
                    super.field343[var11] = super.field343[var11 + -1];
                    super.field344[var11] = super.field344[var11 + -1];
                    super.field342[var11] = super.field342[var11 - 1];
                }
                super.field343[0] = arg3;
                super.field344[0] = arg5;
                super.field342[0] = 1;
                return;
            }
        }
        super.field343[0] = arg3;
        super.field333 = 0;
        super.field335 = 0;
        super.field336 = 0;
        int var12 = -5 / ((79 - arg2) / 47);
        super.field344[0] = arg5;
        super.field6965 = (super.field344[0] << 7) - -(arg0 << 6);
        super.field6961 = (super.field343[0] << 7) + (arg0 << 6);
        if (super.field337 != null) {
            super.field337.method818();
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIILqa;)Z", line = 509)
    public final boolean method553(int arg0, int arg1, int arg2, class167 arg3) {
        ++field4165;
        if (this.field4157 != null && this.method1791(131072, 0, arg3)) {
            class15 var5 = arg3.method312();
            int var6 = super.field318.method650((byte) -6);
            var5.method41(var6);
            var5.method37(super.field6961, super.field6954, super.field6965);
            boolean var7 = false;
            for (int var8 = 0; ~super.field334.length < ~var8; ++var8) {
                if (super.field334[var8] != null && super.field334[var8].method1131(arg1, arg0, var5, ~this.field4157.field4620 == -2)) {
                    var7 = true;
                    break;
                }
            }
            if (arg2 < 42) {
                field4141 = -0.22507414F;
            }
            super.field334[0] = super.field334[1] = super.field334[2] = super.field334[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBLuc;II)V", line = 548)
    public static final void method1796(int arg0, byte arg1, class23 arg2, int arg3, int arg4) {
        ++field4158;
        if (arg1 > -91) {
            field4164 = null;
        }
        class236 var5 = arg2.method139((byte) -81);
        int var6 = -arg2.field318.field1402 + arg2.field281 & 16383;
        if (~arg3 == 0) {
            if (~var6 == -1 && arg2.field315 <= 25) {
                if (!arg2.field240 || !var5.method1562(arg2.field248, (byte) 102)) {
                    arg2.field248 = var5.method1563(0);
                    arg2.field240 = arg2.field248 != -1;
                }
            } else {
                arg2.field240 = false;
                if (~arg0 > -1 && ~var5.field3518 != 0) {
                    arg2.field248 = var5.field3518;
                } else if (~arg0 < -1 && ~var5.field3552 != 0) {
                    arg2.field248 = var5.field3552;
                } else {
                    arg2.field248 = var5.field3517;
                }
            }
        } else if (~arg2.field260 == 0 || var6 < 10240 && ~var6 < -2049) {
            if (~var6 == -1 && arg2.field315 <= 25) {
                arg2.field240 = false;
                if (arg3 == 2 && ~var5.field3515 != 0) {
                    arg2.field248 = var5.field3515;
                } else if (~arg3 == -1 && ~var5.field3553 != 0) {
                    arg2.field248 = var5.field3553;
                } else {
                    arg2.field248 = var5.field3517;
                }
            } else {
                if (~arg3 == -3 && ~var5.field3515 != 0) {
                    if (arg0 < 0 && var5.field3528 != -1) {
                        arg2.field248 = var5.field3528;
                    } else if (arg0 > 0 && var5.field3547 != -1) {
                        arg2.field248 = var5.field3547;
                    } else {
                        arg2.field248 = var5.field3515;
                    }
                } else if (arg3 == 0 && ~var5.field3553 != 0) {
                    if (~arg0 > -1 && ~var5.field3516 != 0) {
                        arg2.field248 = var5.field3516;
                    } else if (~arg0 < -1 && ~var5.field3538 != 0) {
                        arg2.field248 = var5.field3538;
                    } else {
                        arg2.field248 = var5.field3553;
                    }
                } else if (~arg0 > -1 && ~var5.field3539 != 0) {
                    arg2.field248 = var5.field3539;
                } else if (~arg0 < -1 && ~var5.field3541 != 0) {
                    arg2.field248 = var5.field3541;
                } else {
                    arg2.field248 = var5.field3517;
                }
                arg2.field240 = false;
            }
        } else {
            int var7 = class132.field2063[arg4] - arg2.field318.field1402 & 16383;
            arg2.field240 = false;
            if (arg3 == 2 && var5.field3515 != -1) {
                if (~var7 < -2049 && ~var7 >= -6145 && var5.field3524 != -1) {
                    arg2.field248 = var5.field3524;
                } else if (var7 >= 10240 && ~var7 > -14337 && ~var5.field3533 != 0) {
                    arg2.field248 = var5.field3533;
                } else if (var7 > 6144 && var7 < 10240 && ~var5.field3554 != 0) {
                    arg2.field248 = var5.field3554;
                } else {
                    arg2.field248 = var5.field3515;
                }
            } else if (~arg3 == -1 && var5.field3553 != -1) {
                if (var7 > 2048 && var7 <= 6144 && ~var5.field3522 != 0) {
                    arg2.field248 = var5.field3522;
                } else if (~var7 <= -10241 && ~var7 > -14337 && ~var5.field3542 != 0) {
                    arg2.field248 = var5.field3542;
                } else if (var7 > 6144 && ~var7 > -10241 && ~var5.field3544 != 0) {
                    arg2.field248 = var5.field3544;
                } else {
                    arg2.field248 = var5.field3553;
                }
            } else if (~var7 < -2049 && var7 <= 6144 && var5.field3557 != -1) {
                arg2.field248 = var5.field3557;
            } else if (var7 >= 10240 && var7 < 14336 && ~var5.field3540 != 0) {
                arg2.field248 = var5.field3540;
            } else if (~var7 < -6145 && var7 < 10240 && ~var5.field3537 != 0) {
                arg2.field248 = var5.field3537;
            } else {
                arg2.field248 = var5.field3517;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "(I)Z", line = 709)
    public final boolean method1797(int arg0) {
        ++field4150;
        if (this.field4157 == null) {
            return false;
        } else {
            if (arg0 != -12708) {
                this.method552((class167) null, (byte) -67);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIILqa;ZLee;Z)V", line = 724)
    public final void method558(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, class487 arg5, boolean arg6) {
        if (arg4) {
            field4147 = 97;
        }
        ++field4140;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Lqa;B)Lem;", line = 740)
    public final class154 method562(class167 arg0, byte arg1) {
        ++field4148;
        if (arg1 > -117) {
            this.field4161 = 52;
        }
        return null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Z", line = 752)
    public static final boolean method1798(int arg0, int arg1) {
        if (arg0 != -14337) {
            method1799(false);
        }
        ++field4144;
        return arg1 == 6 || arg1 == 8;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(Z)I", line = 768)
    public static final int method1799(boolean arg0) {
        if (arg0) {
            return 70;
        } else {
            ++field4146;
            return 2;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 784)
    public final void method549(boolean arg0) {
        ++field4153;
        if (arg0) {
            this.field4154 = 18;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIB)V", line = 795)
    public final void method1800(int arg0, int arg1, byte arg2) {
        ++field4162;
        int var4 = super.field343[0];
        int var5 = super.field344[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (arg1 == 1) {
            ++var5;
            ++var4;
        }
        if (arg1 == 2) {
            ++var4;
        }
        if (arg2 != 47) {
            this.method1792(false);
        }
        if (~arg1 == -4) {
            --var5;
            ++var4;
        }
        if (~arg1 == -5) {
            --var5;
        }
        if (arg1 == 5) {
            --var5;
            --var4;
        }
        if (~arg1 == -7) {
            --var4;
        }
        if (super.field274 != -1 && class96.field1526.method2717(-99, super.field274).field2706 == 1) {
            super.field274 = -1;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        if (super.field286 != -1) {
            class394 var6 = class69.field1133.method1312(super.field286, (byte) -39);
            if (var6.field5607 && var6.field5596 != -1 && ~class96.field1526.method2717(arg2 + -168, var6.field5596).field2706 == -2) {
                super.field286 = -1;
            }
        }
        if (~super.field250 != 0) {
            class394 var7 = class69.field1133.method1312(super.field250, (byte) -39);
            if (var7.field5607 && var7.field5596 != -1 && ~class96.field1526.method2717(-92, var7.field5596).field2706 == -2) {
                super.field250 = -1;
            }
        }
        if (~super.field333 > -10) {
            ++super.field333;
        }
        for (int var8 = super.field333; ~var8 < -1; --var8) {
            super.field343[var8] = super.field343[var8 + -1];
            super.field344[var8] = super.field344[var8 + -1];
            super.field342[var8] = super.field342[var8 + -1];
        }
        super.field343[0] = var4;
        super.field342[0] = (byte) arg0;
        super.field344[0] = var5;
    }
}
