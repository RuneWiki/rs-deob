import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class727 extends class381 {

    @OriginalMember(owner = "client!ft", name = "Tc", descriptor = "I")
    public int field9536 = -1;

    @OriginalMember(owner = "client!ft", name = "dd", descriptor = "I")
    public int field9546 = 1;

    @OriginalMember(owner = "client!ft", name = "gd", descriptor = "I")
    public int field9549 = -1;

    @OriginalMember(owner = "client!ft", name = "jd", descriptor = "I")
    public int field9552 = 1;

    @OriginalMember(owner = "client!ft", name = "Pc", descriptor = "I")
    public static int field9532;

    @OriginalMember(owner = "client!ft", name = "Qc", descriptor = "I")
    public static int field9533;

    @OriginalMember(owner = "client!ft", name = "Rc", descriptor = "I")
    public static int field9534;

    @OriginalMember(owner = "client!ft", name = "Sc", descriptor = "I")
    public static int field9535;

    @OriginalMember(owner = "client!ft", name = "Uc", descriptor = "I")
    public static int field9537;

    @OriginalMember(owner = "client!ft", name = "Vc", descriptor = "I")
    public static int field9538;

    @OriginalMember(owner = "client!ft", name = "Wc", descriptor = "I")
    public static int field9539;

    @OriginalMember(owner = "client!ft", name = "Xc", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!ft", name = "Yc", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!ft", name = "Zc", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!ft", name = "ad", descriptor = "I")
    public static int field9543;

    @OriginalMember(owner = "client!ft", name = "ed", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!ft", name = "fd", descriptor = "I")
    public static int field9548;

    @OriginalMember(owner = "client!ft", name = "hd", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!ft", name = "kd", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!ft", name = "ld", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!ft", name = "md", descriptor = "I")
    public int field9555;

    @OriginalMember(owner = "client!ft", name = "nd", descriptor = "I")
    public static int field9556;

    @OriginalMember(owner = "client!ft", name = "od", descriptor = "I")
    public static int field9557;

    @OriginalMember(owner = "client!ft", name = "cd", descriptor = "Lgj;")
    public class240 field9545;

    @OriginalMember(owner = "client!ft", name = "bd", descriptor = "Lge;")
    public class425 field9544;

    @OriginalMember(owner = "client!ft", name = "id", descriptor = "Ljava/lang/String;")
    public String field9551;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lha;II)Z", line = 3)
    private final boolean method3886(class570 arg0, int arg1, int arg2) {
        ++field9532;
        int var4 = arg1;
        class68 var5 = this.method2169(0);
        class11 var6 = super.field4700 != -1 && ~super.field4692 == -1 ? class143.field1864.method4265(true, super.field4700) : null;
        class11 var7 = ~super.field4696 == 0 || super.field4715 && var6 != null ? null : class143.field1864.method4265(true, super.field4696);
        int var8 = var5.field902;
        int var9 = var5.field921;
        if (var8 != 0 || var9 != 0 || var5.field901 != 0 || ~var5.field896 != -1) {
            arg1 |= 7;
        }
        boolean var10 = ~super.field4674 != -1 && super.field4711 <= class693.field8900 && class693.field8900 < super.field4718;
        if (var10) {
            arg1 |= 524288;
        }
        int var11 = super.field4728.method2797(23908);
        class299 var12 = super.field4760[0] = this.field9545.method1581(super.field4721, arg0, super.field4729, -107, class66.field869, super.field4752, super.field4694, super.field4753, class143.field1864, super.field4667, var11, this.field9544, class381.field4705, arg1, var7, super.field4716, var6, super.field4722);
        if (var12 == null) {
            return false;
        } else {
            super.field4742 = var12.method1260();
            super.field4724 = var12.method1296();
            this.method2181(var12, (byte) 6);
            if (arg2 <= 75) {
                this.field9549 = -4;
            }
            if (~var8 == -1 && ~var9 == -1) {
                this.method2187(0, (byte) 123, this.method190((byte) -88) << 9, var11, 0, this.method190((byte) 89) << 9);
            } else {
                this.method2187(var5.field903, (byte) 110, var8, var11, var5.field939, var9);
                if (super.field4669 != 0) {
                    super.field4760[0].method1271(super.field4669);
                }
                if (super.field4679 != 0) {
                    super.field4760[0].method1289(super.field4679);
                }
                if (super.field4706 != 0) {
                    super.field4760[0].method1263(0, super.field4706, 0);
                }
            }
            if (var10) {
                var12.method1251(super.field4713, super.field4686, super.field4699, 255 & super.field4674);
            }
            this.method2176(var4, (byte) 25, var11, var5, var8, arg0, var9);
            return true;
        }
    }

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "(I)I", line = 69)
    public final int method188(int arg0) {
        if (arg0 != 0) {
            this.method3888(97, 122, -122, true, -42, 78);
        }
        ++field9538;
        if (this.field9545.field3289 != null) {
            class240 var2 = this.field9545.method1585((byte) -100, class381.field4705);
            if (var2 != null && ~var2.field3283 != 0) {
                return var2.field3283;
            }
        }
        return this.field9545.field3283;
    }

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "(B)I", line = 93)
    public final int method1405(byte arg0) {
        ++field9543;
        if (arg0 <= 17) {
            return 80;
        } else {
            return this.field9545 == null ? 0 : this.field9545.field3296;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lgj;I)V", line = 107)
    public final void method3887(class240 arg0, int arg1) {
        if (arg1 == 1) {
            this.field9545 = arg0;
            ++field9541;
            if (this.field9545 != null) {
                this.field9555 = this.field9545.field3263;
                this.field9551 = this.field9545.field3274;
            }
            if (super.field4766 != null) {
                super.field4766.method2832();
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIZII)V", line = 127)
    public final void method3888(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field9534;
        super.field2895 = super.field2889 = (byte) arg5;
        if (class433.method2484(arg0, 0, arg2)) {
            ++super.field2889;
        }
        if (super.field4700 != -1 && class143.field1864.method4265(true, super.field4700).field115 == 1) {
            super.field4700 = -1;
            super.field4748 = null;
        }
        for (int var7 = 0; ~var7 > ~super.field4747.length; ++var7) {
            if (super.field4747[var7].field5625 != -1) {
                class353 var11 = class62.field819.method562((byte) 102, super.field4747[var7].field5625);
                if (var11.field4314 && ~var11.field4292 != 0 && class143.field1864.method4265(true, var11.field4292).field115 == 1) {
                    super.field4747[var7].field5625 = -1;
                }
            }
        }
        if (!arg3) {
            int var8 = -super.field4767[0] + arg2;
            int var9 = arg0 - super.field4758[0];
            if (var8 >= -8 && ~var8 >= -9 && var9 >= -8 && ~var9 >= -9) {
                if (~super.field4764 > -10) {
                    ++super.field4764;
                }
                for (int var10 = super.field4764; ~var10 < -1; --var10) {
                    super.field4767[var10] = super.field4767[var10 + -1];
                    super.field4758[var10] = super.field4758[var10 + -1];
                    super.field4761[var10] = super.field4761[var10 - 1];
                }
                super.field4767[0] = arg2;
                super.field4758[0] = arg0;
                super.field4761[0] = 1;
                return;
            }
        }
        super.field4765 = arg4;
        super.field4759 = 0;
        super.field4767[0] = arg2;
        super.field4764 = 0;
        super.field4758[0] = arg0;
        super.field2900 = (super.field4758[0] << 9) + (arg1 << 8);
        super.field2896 = (super.field4767[0] << 9) + (arg1 << 8);
        if (super.field4766 != null) {
            super.field4766.method2832();
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZIBLlq;Lha;II)V", line = 207)
    public final void method174(boolean arg0, int arg1, byte arg2, class210 arg3, class570 arg4, int arg5, int arg6) {
        ++field9556;
        if (arg2 != -126) {
            this.method3888(-5, 91, -113, true, -19, -74);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "(I)I", line = 221)
    public final int method183(int arg0) {
        ++field9537;
        if (arg0 != -21397) {
            this.field9549 = 2;
        }
        if (this.field9545.field3289 != null) {
            class240 var2 = this.field9545.method1585((byte) -100, class381.field4705);
            if (var2 != null && ~var2.field3260 != 0) {
                return var2.field3260;
            }
        }
        return this.field9545.field3260;
    }

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "(I)V", line = 246)
    public static final void method3889(int arg0) {
        class483.field6238.method3594(-59);
        ++field9554;
        if (arg0 != -11108) {
            method3889(-31);
        }
        class261.field3496 = 0;
    }

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)I", line = 259)
    public final int method2173(int arg0) {
        ++field9553;
        if (arg0 >= -36) {
            this.method3886((class570) null, 7, -121);
        }
        if (this.field9545.field3289 != null) {
            class240 var2 = this.field9545.method1585((byte) -100, class381.field4705);
            if (var2 != null && var2.field3301 != -1) {
                return var2.field3301;
            }
        }
        return ~this.field9545.field3301 != 0 ? this.field9545.field3301 : super.method2173(-74);
    }

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "(I)Z", line = 281)
    private final boolean method3890(int arg0) {
        ++field9548;
        if (arg0 <= 123) {
            this.field9551 = null;
        }
        return this.field9545.field3291;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(ILha;)Lpi;", line = 298)
    public final class266 method187(int arg0, class570 arg1) {
        ++field9540;
        if (this.field9545 != null && this.method3886(arg1, 2048, 116)) {
            if (arg0 != -29562) {
                return null;
            } else {
                class465 var3 = arg1.method948();
                int var4 = super.field4728.method2797(23908);
                var3.method454(var4);
                class766 var5 = class28.field252[super.field2895][super.field2896 >> class88.field1221][super.field2900 >> class88.field1221];
                if (var5 != null && var5.field10426 != null) {
                    int var6 = super.field4665 - var5.field10426.field5504;
                    super.field4665 = (int) ((float) super.field4665 - (float) var6 / 10.0F);
                } else {
                    super.field4665 = (int) ((float) super.field4665 - (float) super.field4665 / 10.0F);
                }
                var3.method450(super.field2896, super.field2892 + -20 - super.field4665, super.field2900);
                class68 var7 = this.method2169(arg0 + 29562);
                class240 var8 = this.field9545.field3289 == null ? this.field9545 : this.field9545.method1585((byte) -100, class381.field4705);
                super.field4763 = false;
                class266 var9 = null;
                if (class485.field6252.field6923.method2789(false) == 1 && var8.field3255 && var7.field895) {
                    class11 var10 = super.field4700 != -1 && super.field4692 == 0 ? class143.field1864.method4265(true, super.field4700) : null;
                    class11 var11 = ~super.field4696 == 0 || super.field4715 && var10 != null ? null : class143.field1864.method4265(true, super.field4696);
                    class299 var12 = class160.method1018(65535 & this.field9545.field3282, 255 & this.field9545.field3246, var11 != null ? var11 : var10, super.field4706, super.field4679, this.field9545.field3314, super.field4760[0], arg1, var11 != null ? super.field4722 : super.field4721, this.field9545.field3316 & 65535, var4, this.field9545.field3249 & 255, super.field4669, arg0 + 29449);
                    if (var12 != null) {
                        var9 = class689.method3680((byte) -15, this.method3890(125), super.field4760.length + 1);
                        super.field4763 = true;
                        arg1.method883(false);
                        if (!class653.field8360) {
                            var12.method1297(var3, var9.field3533[super.field4760.length], 0);
                        } else {
                            var12.method1292(var3, var9.field3533[super.field4760.length], class628.field7974, 0);
                        }
                        arg1.method883(true);
                    }
                }
                var3.method454(var4);
                var3.method450(super.field2896, super.field2892 - 5 + -super.field4665, super.field2900);
                if (var9 == null) {
                    var9 = class689.method3680((byte) -15, this.method3890(arg0 ^ -29448), super.field4760.length);
                }
                this.method2184(false, arg0 + 25514, super.field4760, arg1, var3);
                if (class653.field8360) {
                    for (int var13 = 0; var13 < super.field4760.length; ++var13) {
                        if (super.field4760[var13] != null) {
                            super.field4760[var13].method1292(var3, var9.field3533[var13], class628.field7974, 0);
                        }
                    }
                } else {
                    for (int var14 = 0; var14 < super.field4760.length; ++var14) {
                        if (super.field4760[var14] != null) {
                            super.field4760[var14].method1297(var3, var9.field3533[var14], 0);
                        }
                    }
                }
                if (super.field4766 != null) {
                    class705 var15 = super.field4766.method2844();
                    if (!class653.field8360) {
                        arg1.method912(var15);
                    } else {
                        arg1.method980(var15, class628.field7974);
                    }
                }
                for (int var16 = 0; super.field4760.length > var16; ++var16) {
                    if (super.field4760[var16] != null) {
                        super.field4763 |= super.field4760[var16].method1272();
                    }
                }
                super.field4691 = class495.field6333;
                super.field4760[0] = super.field4760[1] = super.field4760[2] = null;
                return var9;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)Z", line = 429)
    public final boolean method171(int arg0) {
        if (arg0 >= -80) {
            this.method183(109);
        }
        ++field9533;
        return false;
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(ILha;)Lid;", line = 442)
    public final class486 method170(int arg0, class570 arg1) {
        int var3 = -111 / ((-9 - arg0) / 63);
        ++field9550;
        return null;
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(III)V", line = 463)
    public final void method3891(int arg0, int arg1, int arg2) {
        ++field9539;
        int var4 = super.field4767[0];
        int var5 = super.field4758[0];
        if (arg2 == 0) {
            ++var5;
        }
        if (arg0 == arg2) {
            ++var5;
            ++var4;
        }
        if (arg2 == 2) {
            ++var4;
        }
        if (~arg2 == -4) {
            ++var4;
            --var5;
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (arg2 == 5) {
            --var4;
            --var5;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (~super.field4700 != 0 && class143.field1864.method4265(true, super.field4700).field115 == 1) {
            super.field4700 = -1;
            super.field4748 = null;
        }
        if (arg2 == 7) {
            --var4;
            ++var5;
        }
        for (int var6 = 0; var6 < super.field4747.length; ++var6) {
            if (super.field4747[var6].field5625 != -1) {
                class353 var8 = class62.field819.method562((byte) 102, super.field4747[var6].field5625);
                if (var8.field4314 && var8.field4292 != -1 && class143.field1864.method4265(true, var8.field4292).field115 == 1) {
                    super.field4747[var6].field5625 = -1;
                }
            }
        }
        if (~super.field4764 > -10) {
            ++super.field4764;
        }
        for (int var7 = super.field4764; ~var7 < -1; --var7) {
            super.field4767[var7] = super.field4767[var7 + -1];
            super.field4758[var7] = super.field4758[var7 - 1];
            super.field4761[var7] = super.field4761[var7 + -1];
        }
        super.field4767[0] = var4;
        super.field4758[0] = var5;
        super.field4761[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lha;I)V", line = 563)
    public final void method182(class570 arg0, int arg1) {
        ++field9547;
        if (this.field9545 != null) {
            if (super.field4757 || this.method3886(arg0, 0, 127)) {
                class465 var3 = arg0.method948();
                var3.method454(super.field4728.method2797(23908));
                var3.method450(super.field2896, super.field2892 + -20, super.field2900);
                this.method2184(super.field4757, -4048, super.field4760, arg0, var3);
                int var4 = 0;
                if (arg1 > -87) {
                    this.method182((class570) null, 127);
                }
                while (super.field4760.length > var4) {
                    super.field4760[var4] = null;
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILha;I)Z", line = 596)
    public final boolean method179(int arg0, int arg1, class570 arg2, int arg3) {
        ++field9542;
        if (this.field9545 != null && this.method3886(arg2, 131072, 127)) {
            class465 var5 = arg2.method948();
            int var6 = super.field4728.method2797(23908);
            var5.method454(var6);
            var5.method450(super.field2896, super.field2892, super.field2900);
            boolean var7 = false;
            int var8 = -128 % ((arg3 - -23) / 37);
            for (int var9 = 0; var9 < super.field4760.length; ++var9) {
                if (super.field4760[var9] != null) {
                    boolean var10000;
                    label52: {
                        if (~this.field9545.field3296 >= -1) {
                            label50: {
                                if (~this.field9545.field3315 != 0) {
                                    if (~this.field9545.field3315 == -2) {
                                        break label50;
                                    }
                                    var10000 = false;
                                } else {
                                    if (~this.field9545.field3314 == -2) {
                                        break label50;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label52;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var10 = var10000;
                    boolean var11;
                    if (!class653.field8360) {
                        var11 = super.field4760[var9].method1264(arg0, arg1, var5, var10, this.field9545.field3296);
                    } else {
                        var11 = super.field4760[var9].method1233(arg0, arg1, var5, var10, this.field9545.field3296, class628.field7974);
                    }
                    if (var11) {
                        var7 = true;
                        break;
                    }
                }
            }
            for (int var12 = 0; var12 < super.field4760.length; ++var12) {
                super.field4760[var12] = null;
            }
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V", line = 657)
    public final void method185(int arg0) {
        if (arg0 == 0) {
            ++field9535;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)Z", line = 670)
    public final boolean method3892(byte arg0) {
        if (arg0 != -106) {
            this.method183(-30);
        }
        ++field9557;
        return this.field9545 != null;
    }
}
