import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class390 {

    @OriginalMember(owner = "client!ff", name = "vd", descriptor = "I")
    public int field120 = -1;

    @OriginalMember(owner = "client!ff", name = "Id", descriptor = "I")
    public int field133 = -1;

    @OriginalMember(owner = "client!ff", name = "pd", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ff", name = "qd", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ff", name = "rd", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ff", name = "sd", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ff", name = "td", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ff", name = "ud", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ff", name = "wd", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ff", name = "xd", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ff", name = "yd", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ff", name = "zd", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ff", name = "Ad", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ff", name = "Cd", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ff", name = "Dd", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ff", name = "Ed", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ff", name = "Fd", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ff", name = "Gd", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ff", name = "Hd", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ff", name = "Jd", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ff", name = "Kd", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ff", name = "Ld", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ff", name = "Bd", descriptor = "Lbb;")
    public class334 field126;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)V")
    public static final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -22728) {
            field124 = 121;
        }
        if (~class140.field2314 >= ~(arg6 - arg1) && ~(arg1 + arg6) >= ~class536.field7419 && ~class58.field1150 >= ~(-arg1 + arg4) && arg1 + arg4 <= class479.field6682) {
            class149.method1174(arg1, arg6, (byte) -68, arg2, arg4, arg5, arg0);
        } else {
            class201.method1410(arg0, arg4, arg5, arg1, 2, arg2, arg6);
        }
        ++field119;
    }

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "(I)Z")
    private final boolean method51(int arg0) {
        if (arg0 != 1810797122) {
            this.field120 = -103;
        }
        ++field131;
        return this.field126.field4713;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lha;IZLga;IBI)V")
    public final void method33(class59 arg0, int arg1, boolean arg2, class404 arg3, int arg4, byte arg5, int arg6) {
        if (arg5 > -106) {
            this.field126 = null;
        }
        ++field134;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
    public final void method44(boolean arg0) {
        ++field128;
        if (!arg0) {
            this.field120 = -13;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method42(class59 arg0, int arg1, int arg2, int arg3) {
        ++field135;
        if (this.field126 != null && this.method60(97, 131072, arg0)) {
            class661 var5 = arg0.method322();
            int var6 = super.field5643.method1611((byte) -78);
            var5.method748(var6);
            var5.method752(super.field5922, super.field5927, super.field5933);
            boolean var7 = false;
            for (int var8 = arg3; ~var8 > ~super.field5749.length; ++var8) {
                if (super.field5749[var8] != null) {
                    boolean var10000;
                    label43: {
                        if (this.field126.field4654 <= 0) {
                            label41: {
                                if (this.field126.field4650 != -1) {
                                    if (~this.field126.field4650 == -2) {
                                        break label41;
                                    }
                                    var10000 = false;
                                } else {
                                    if (~this.field126.field4716 == -2) {
                                        break label41;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label43;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (class458.field6459) {
                        var10 = super.field5749[var8].method492(arg2, arg1, var5, var9, this.field126.field4654, class58.field1146);
                    } else {
                        var10 = super.field5749[var8].method503(arg2, arg1, var5, var9, this.field126.field4654);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field5749[0] = super.field5749[1] = super.field5749[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
    public final void method52(int arg0, int arg1, int arg2) {
        ++field118;
        int var4 = super.field5746[0];
        int var5 = super.field5743[0];
        if (arg0 == 0) {
            ++var5;
        }
        if (~arg0 == -2) {
            ++var4;
            ++var5;
        }
        if (~arg0 == -3) {
            ++var4;
        }
        if (~arg0 == -4) {
            ++var4;
            --var5;
        }
        if (arg0 == 4) {
            --var5;
        }
        if (~arg0 == -6) {
            --var4;
            --var5;
        }
        if (~arg0 == -7) {
            --var4;
        }
        if (arg0 == 7) {
            --var4;
            ++var5;
        }
        if (super.field5712 != -1 && ~class456.field6436.method1021(super.field5712, 7).field9335 == -2) {
            super.field5712 = -1;
            super.field5662 = null;
        }
        if (super.field5695 != -1) {
            class654 var6 = class104.field1840.method3016((byte) 118, super.field5695);
            if (var6.field8964 && ~var6.field8980 != 0 && ~class456.field6436.method1021(var6.field8980, 7).field9335 == -2) {
                super.field5695 = -1;
            }
        }
        if (super.field5717 != -1) {
            class654 var7 = class104.field1840.method3016((byte) 77, super.field5717);
            if (var7.field8964 && ~var7.field8980 != 0 && class456.field6436.method1021(var7.field8980, 7).field9335 == 1) {
                super.field5717 = -1;
            }
        }
        if (~super.field5745 > arg2) {
            ++super.field5745;
        }
        for (int var8 = super.field5745; var8 > 0; --var8) {
            super.field5746[var8] = super.field5746[var8 + -1];
            super.field5743[var8] = super.field5743[var8 + -1];
            super.field5747[var8] = super.field5747[var8 + -1];
        }
        super.field5746[0] = var4;
        super.field5743[0] = var5;
        super.field5747[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(ILha;)Ljda;")
    public final class228 method41(int arg0, class59 arg1) {
        ++field122;
        if (this.field126 != null && this.method60(arg0 + 114, 2048, arg1)) {
            class661 var3 = arg1.method322();
            int var4 = super.field5643.method1611((byte) -69);
            var3.method748(var4);
            class384 var5 = class649.field8928[super.field5926][super.field5922 >> class130.field2185][super.field5933 >> class130.field2185];
            if (var5 != null && var5.field5573 != null) {
                int var6 = -var5.field5573.field2726 + super.field5700;
                super.field5700 = (int) ((float) super.field5700 - (float) var6 / 10.0F);
            } else {
                super.field5700 = (int) ((float) super.field5700 - (float) super.field5700 / 10.0F);
            }
            var3.method752(super.field5922, -super.field5700 + super.field5927 + -20, super.field5933);
            class399 var7 = this.method2445((byte) 72);
            class334 var8 = this.field126.field4694 != null ? this.field126.method2110(class390.field5635, -1) : this.field126;
            super.field5750 = false;
            class228 var9 = null;
            if (class693.field9368.field4467.method2142(-32350) == arg0 && var8.field4686 && var7.field5857) {
                class691 var10 = super.field5712 != -1 && super.field5644 == 0 ? class456.field6436.method1021(super.field5712, 7) : null;
                class691 var11 = super.field5694 == -1 || super.field5639 && var10 != null ? null : class456.field6436.method1021(super.field5694, 7);
                class472 var12 = class362.method2310(super.field5728, var4, super.field5749[0], super.field5634, false, var11 == null ? super.field5693 : super.field5671, 65535 & this.field126.field4656, this.field126.field4716, super.field5678, arg1, 255 & this.field126.field4670, this.field126.field4667 & 65535, this.field126.field4664 & 255, var11 == null ? var10 : var11);
                if (var12 != null) {
                    var9 = class345.method2171(super.field5749.length + 1, this.method51(1810797122), false);
                    super.field5750 = true;
                    arg1.method306(false);
                    if (!class458.field6459) {
                        var12.method521(var3, var9.field3313[super.field5749.length], 0);
                    } else {
                        var12.method497(var3, var9.field3313[super.field5749.length], class58.field1146, 0);
                    }
                    arg1.method306(true);
                }
            }
            var3.method748(var4);
            var3.method752(super.field5922, super.field5927 + -5 + -super.field5700, super.field5933);
            if (var9 == null) {
                var9 = class345.method2171(super.field5749.length, this.method51(1810797122), false);
            }
            this.method2453(arg1, -15074, var3, false, super.field5749);
            if (!class458.field6459) {
                for (int var13 = 0; super.field5749.length > var13; ++var13) {
                    if (super.field5749[var13] != null) {
                        super.field5749[var13].method521(var3, var9.field3313[var13], 0);
                    }
                }
            } else {
                for (int var14 = 0; super.field5749.length > var14; ++var14) {
                    if (super.field5749[var14] != null) {
                        super.field5749[var14].method497(var3, var9.field3313[var14], class58.field1146, 0);
                    }
                }
            }
            if (super.field5753 != null) {
                class266 var15 = super.field5753.method2419();
                if (class458.field6459) {
                    arg1.method295(var15, class58.field1146);
                } else {
                    arg1.method208(var15);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field5749.length; ++var16) {
                if (super.field5749[var16] != null) {
                    super.field5750 |= super.field5749[var16].method488();
                }
            }
            super.field5727 = class448.field6342;
            super.field5749[0] = super.field5749[1] = super.field5749[2] = null;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(B)I")
    public final int method53(byte arg0) {
        ++field116;
        if (this.field126.field4694 != null) {
            class334 var2 = this.field126.method2110(class390.field5635, -1);
            if (var2 != null && var2.field4683 != -1) {
                return var2.field4683;
            }
        }
        if (arg0 < 113) {
            this.method61((class334) null, 88);
        }
        return this.field126.field4683;
    }

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "(I)I")
    public final int method54(int arg0) {
        ++field127;
        if (arg0 >= -109) {
            this.field120 = -47;
        }
        return this.field126 == null ? 0 : this.field126.field4654;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZIIII)V")
    public final void method55(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field5926 = super.field5921 = (byte) arg5;
        ++field136;
        if (class334.method2118(arg0, arg2, true)) {
            ++super.field5921;
        }
        if (~super.field5712 != 0 && ~class456.field6436.method1021(super.field5712, 7).field9335 == -2) {
            super.field5662 = null;
            super.field5712 = -1;
        }
        if (super.field5695 != -1) {
            class654 var7 = class104.field1840.method3016((byte) 117, super.field5695);
            if (var7.field8964 && var7.field8980 != -1 && ~class456.field6436.method1021(var7.field8980, 7).field9335 == -2) {
                super.field5695 = -1;
            }
        }
        if (super.field5717 != -1) {
            class654 var8 = class104.field1840.method3016((byte) 56, super.field5717);
            if (var8.field8964 && var8.field8980 != -1 && ~class456.field6436.method1021(var8.field8980, 7).field9335 == -2) {
                super.field5717 = -1;
            }
        }
        if (!arg1) {
            int var9 = arg2 - super.field5746[0];
            int var10 = -super.field5743[0] + arg0;
            if (var9 >= -8 && var9 <= 8 && ~var10 <= 7 && var10 <= 8) {
                if (~super.field5745 > -10) {
                    ++super.field5745;
                }
                for (int var11 = super.field5745; var11 > 0; --var11) {
                    super.field5746[var11] = super.field5746[var11 - 1];
                    super.field5743[var11] = super.field5743[var11 + -1];
                    super.field5747[var11] = super.field5747[var11 + -1];
                }
                super.field5746[0] = arg2;
                super.field5743[0] = arg0;
                super.field5747[0] = 1;
                return;
            }
        }
        super.field5748 = 0;
        super.field5745 = 0;
        super.field5746[0] = arg2;
        if (arg3 >= 91) {
            super.field5752 = 0;
            super.field5743[0] = arg0;
            super.field5922 = (super.field5746[0] << 9) + (arg4 << 8);
            super.field5933 = (super.field5743[0] << 9) + (arg4 << 8);
            if (super.field5753 != null) {
                super.field5753.method2423();
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lha;I)Lhw;")
    public final class132 method40(class59 arg0, int arg1) {
        if (arg1 != 7) {
            this.field133 = 102;
        }
        ++field114;
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "(B)Z")
    public final boolean method56(byte arg0) {
        ++field121;
        if (this.field126 == null) {
            return false;
        } else {
            int var2 = 116 % ((-44 - arg0) / 38);
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
    public final int method57(int arg0) {
        ++field117;
        if (this.field126.field4694 != null) {
            class334 var2 = this.field126.method2110(class390.field5635, -1);
            if (var2 != null && ~var2.field4653 != 0) {
                return var2.field4653;
            }
        }
        if (arg0 != -1) {
            this.field120 = -69;
        }
        return this.field126.field4653;
    }

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "(I)Z")
    public final boolean method35(int arg0) {
        ++field123;
        return arg0 > -65;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I")
    public final int method58(int arg0) {
        ++field125;
        if (arg0 != 200) {
            return 115;
        } else {
            if (this.field126.field4694 != null) {
                class334 var2 = this.field126.method2110(class390.field5635, -1);
                if (var2 != null && var2.field4707 != -1) {
                    return var2.field4707;
                }
            }
            return this.field126.field4707 == -1 ? super.method58(200) : this.field126.field4707;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(Lha;I)V")
    public final void method31(class59 arg0, int arg1) {
        ++field130;
        if (this.field126 != null) {
            if (super.field5744 || this.method60(123, 0, arg0)) {
                if (arg1 > -125) {
                    this.method42((class59) null, -2, -103, 34);
                }
                class661 var3 = arg0.method322();
                var3.method748(super.field5643.method1611((byte) -118));
                var3.method752(super.field5922, super.field5927 + -20, super.field5933);
                this.method2453(arg0, -15074, var3, super.field5744, super.field5749);
                super.field5749[0] = super.field5749[1] = super.field5749[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(CB)Z")
    public static final boolean method59(char arg0, byte arg1) {
        if (arg1 != 105) {
            field124 = 124;
        }
        ++field129;
        return arg0 >= '0' && arg0 <= '9' || ~arg0 <= -66 && ~arg0 >= -91 || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILha;)Z")
    private final boolean method60(int arg0, int arg1, class59 arg2) {
        if (arg0 <= 84) {
            this.field126 = null;
        }
        ++field115;
        int var4 = arg1;
        class399 var5 = this.method2445((byte) 72);
        class691 var6 = super.field5712 != -1 && super.field5644 == 0 ? class456.field6436.method1021(super.field5712, 7) : null;
        class691 var7 = super.field5694 == -1 || super.field5639 && var6 != null ? null : class456.field6436.method1021(super.field5694, 7);
        int var8 = var5.field5876;
        int var9 = var5.field5885;
        if (var8 != 0 || var9 != 0 || ~var5.field5894 != -1 || ~var5.field5870 != -1) {
            arg1 |= 7;
        }
        boolean var10 = super.field5705 != 0 && class641.field8810 >= super.field5674 && class641.field8810 < super.field5676;
        if (var10) {
            arg1 |= 524288;
        }
        int var11 = super.field5643.method1611((byte) -25);
        class472 var12 = super.field5749[0] = this.field126.method2116(var11, super.field5734, class456.field6436, false, var7, super.field5629, class624.field8505, super.field5693, var6, class390.field5635, arg2, super.field5738, super.field5722, super.field5670, super.field5671, arg1, super.field5658);
        if (var12 == null) {
            return false;
        } else {
            super.field5633 = var12.method486();
            super.field5656 = var12.method513();
            this.method2460(-125, var12);
            if (var8 == 0 && var9 == 0) {
                this.method2447(var11, this.method2457((byte) 78) << 9, 0, this.method2457((byte) 108) << 9, (byte) 92, 0);
            } else {
                this.method2447(var11, var8, var5.field5887, var9, (byte) 78, var5.field5856);
                if (super.field5728 != 0) {
                    super.field5749[0].method515(super.field5728);
                }
                if (~super.field5634 != -1) {
                    super.field5749[0].method502(super.field5634);
                }
                if (super.field5678 != 0) {
                    super.field5749[0].method528(0, super.field5678, 0);
                }
            }
            if (var10) {
                var12.method516(super.field5681, super.field5632, super.field5696, 255 & super.field5705);
            }
            if (super.field5695 != -1 && super.field5666 != -1) {
                class654 var13 = class104.field1840.method3016((byte) 56, super.field5695);
                boolean var14 = ~var13.field8965 == -4 && (var8 != 0 || var9 != 0);
                int var15 = var4;
                if (!var14) {
                    if (~super.field5663 != -1) {
                        var15 = var4 | 5;
                    }
                    if (super.field5646 != 0) {
                        var15 |= 2;
                    }
                    if (~super.field5704 <= -1) {
                        var15 |= 7;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class472 var16 = super.field5749[1] = var13.method3694(super.field5666, arg2, super.field5669, var15, super.field5709, class456.field6436, (byte) 78);
                if (var16 != null) {
                    if (~super.field5704 > -1) {
                        if (super.field5663 != 0) {
                            var16.method524(super.field5663 * 2048);
                        }
                    } else {
                        int var17 = 0;
                        int var18 = 0;
                        int var19 = 0;
                        if (var5.field5883 != null && var5.field5883[super.field5704] != null) {
                            var19 += var5.field5883[super.field5704][2];
                            var17 += var5.field5883[super.field5704][0];
                            var18 += var5.field5883[super.field5704][1];
                        }
                        if (var5.field5854 != null && var5.field5854[super.field5704] != null) {
                            var18 += var5.field5854[super.field5704][1];
                            var17 += var5.field5854[super.field5704][0];
                            var19 += var5.field5854[super.field5704][2];
                        }
                        if (~var19 != -1 || var17 != 0) {
                            int var20 = var11;
                            if (super.field5722 != null && super.field5722[super.field5704] != -1) {
                                var20 = super.field5722[super.field5704];
                            }
                            int var21 = super.field5663 * 2048 + var20 + -var11 & 16383;
                            if (~var21 != -1) {
                                var16.method524(var21);
                            }
                            int var22 = class255.field3698[var21];
                            int var23 = class255.field3695[var21];
                            int var24 = var19 * var22 - -(var17 * var23) >> 14;
                            var19 = var19 * var23 + -(var17 * var22) >> 14;
                            var17 = var24;
                        }
                        var16.method528(var17, var18, var19);
                    }
                    if (~super.field5646 != -1) {
                        var16.method528(0, -super.field5646 << 2, 0);
                    }
                    if (var14) {
                        if (~super.field5728 != -1) {
                            var16.method515(super.field5728);
                        }
                        if (super.field5634 != 0) {
                            var16.method502(super.field5634);
                        }
                        if (~super.field5678 != -1) {
                            var16.method528(0, super.field5678, 0);
                        }
                    }
                }
            } else {
                super.field5749[1] = null;
            }
            if (~super.field5717 != 0 && ~super.field5650 != 0) {
                class654 var25 = class104.field1840.method3016((byte) 98, super.field5717);
                boolean var26 = ~var25.field8965 == -4 && (var8 != 0 || var9 != 0);
                int var27 = var4;
                if (!var26) {
                    if (~super.field5628 != -1) {
                        var27 = var4 | 5;
                    }
                    if (super.field5686 != 0) {
                        var27 |= 2;
                    }
                    if (super.field5715 >= 0) {
                        var27 |= 7;
                    }
                } else {
                    var27 = var4 | 7;
                }
                class472 var28 = super.field5749[2] = var25.method3690(super.field5699, super.field5702, arg2, var27, 3172, class456.field6436, super.field5650);
                if (var28 != null) {
                    if (super.field5715 >= 0 && var5.field5883 != null && var5.field5883[super.field5715] != null) {
                        int var29 = 0;
                        int var30 = 0;
                        int var31 = 0;
                        if (var5.field5883 != null && var5.field5883[super.field5715] != null) {
                            var30 += var5.field5883[super.field5715][1];
                            var29 += var5.field5883[super.field5715][0];
                            var31 += var5.field5883[super.field5715][2];
                        }
                        if (var5.field5854 != null && var5.field5854[super.field5715] != null) {
                            var30 += var5.field5854[super.field5715][1];
                            var29 += var5.field5854[super.field5715][0];
                            var31 += var5.field5854[super.field5715][2];
                        }
                        if (var31 != 0 || ~var29 != -1) {
                            int var32 = var11;
                            if (super.field5722 != null && super.field5722[super.field5715] != -1) {
                                var32 = super.field5722[super.field5715];
                            }
                            int var33 = 16383 & super.field5628 * 2048 + var32 + -var11;
                            if (var33 != 0) {
                                var28.method524(var33);
                            }
                            int var34 = class255.field3698[var33];
                            int var35 = class255.field3695[var33];
                            int var36 = var31 * var34 - -(var29 * var35) >> 14;
                            var31 = var31 * var35 - var29 * var34 >> 14;
                            var29 = var36;
                        }
                        var28.method528(var29, var30, var31);
                    } else if (super.field5628 != 0) {
                        var28.method524(super.field5628 * 2048);
                    }
                    if (~super.field5686 != -1) {
                        var28.method528(0, -super.field5686 << 2, 0);
                    }
                    if (var26) {
                        if (~super.field5728 != -1) {
                            var28.method515(super.field5728);
                        }
                        if (~super.field5634 != -1) {
                            var28.method502(super.field5634);
                        }
                        if (~super.field5678 != -1) {
                            var28.method528(0, super.field5678, 0);
                        }
                    }
                }
            } else {
                super.field5749[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lbb;I)V")
    public final void method61(class334 arg0, int arg1) {
        ++field132;
        this.field126 = arg0;
        if (arg1 != -2) {
            this.field133 = 69;
        }
        if (super.field5753 != null) {
            super.field5753.method2423();
        }
    }
}
