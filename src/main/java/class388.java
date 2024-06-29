import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class388 extends class287 {

    @OriginalMember(owner = "client!vk", name = "Uc", descriptor = "I")
    public int field4978 = -1;

    @OriginalMember(owner = "client!vk", name = "fd", descriptor = "I")
    public int field4989 = -1;

    @OriginalMember(owner = "client!vk", name = "id", descriptor = "I")
    public int field4992 = 1;

    @OriginalMember(owner = "client!vk", name = "ud", descriptor = "I")
    public int field5004 = 1;

    @OriginalMember(owner = "client!vk", name = "dd", descriptor = "Z")
    public static boolean field4987 = false;

    @OriginalMember(owner = "client!vk", name = "Wc", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!vk", name = "Xc", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!vk", name = "Zc", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!vk", name = "ad", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!vk", name = "bd", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!vk", name = "cd", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!vk", name = "ed", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!vk", name = "gd", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!vk", name = "hd", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!vk", name = "jd", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!vk", name = "kd", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!vk", name = "ld", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!vk", name = "md", descriptor = "I")
    public int field4996;

    @OriginalMember(owner = "client!vk", name = "nd", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!vk", name = "pd", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!vk", name = "qd", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!vk", name = "rd", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!vk", name = "sd", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!vk", name = "vd", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!vk", name = "wd", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!vk", name = "xd", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!vk", name = "Vc", descriptor = "Lnj;")
    public static class260 field4979;

    @OriginalMember(owner = "client!vk", name = "td", descriptor = "Ltd;")
    public class479 field5003;

    @OriginalMember(owner = "client!vk", name = "Yc", descriptor = "Lgfa;")
    public class782 field4982;

    @OriginalMember(owner = "client!vk", name = "od", descriptor = "Ljava/lang/String;")
    public String field4998;

    @OriginalMember(owner = "client!vk", name = "yd", descriptor = "[Ltf;")
    public static class312[] field5008;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(Z)I", line = 8)
    public final int method1671(boolean arg0) {
        ++field4986;
        if (arg0) {
            return 67;
        } else {
            if (this.field5003.field6636 != null) {
                class479 var2 = this.field5003.method2843(class2.field30, 228);
                if (var2 != null && var2.field6668 != -1) {
                    return var2.field6668;
                }
            }
            return this.field5003.field6668 == -1 ? super.method1671(false) : this.field5003.field6668;
        }
    }

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "(I)I", line = 36)
    public final int method1670(int arg0) {
        ++field4999;
        if (this.field5003.field6636 != null) {
            class479 var2 = this.field5003.method2843(class2.field30, 228);
            if (var2 != null && ~var2.field6691 != 0) {
                return var2.field6691;
            }
        }
        if (arg0 > -112) {
            this.method2269((byte) -8);
        }
        return this.field5003.field6691;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)Z", line = 57)
    public final boolean method2269(byte arg0) {
        ++field5006;
        if (this.field5003 == null) {
            return false;
        } else {
            return arg0 <= -87;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lgda;Lha;IIZII)V", line = 73)
    public final void method524(class61 arg0, class66 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg6 < -6) {
            ++field4988;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILha;)Z", line = 85)
    private final boolean method2270(int arg0, int arg1, class66 arg2) {
        ++field4995;
        int var4 = arg0;
        class15 var5 = this.method1676(0);
        class582 var6 = ~super.field3420 != 0 && ~super.field3359 == -1 ? class362.field4504.method3600(arg1 ^ 52, super.field3420) : null;
        class582 var7 = super.field3399 == -1 || super.field3426 && var6 != null ? null : class362.field4504.method3600(arg1 + -83, super.field3399);
        int var8 = var5.field255;
        int var9 = var5.field233;
        if (var8 != 0 || var9 != 0 || var5.field281 != 0 || ~var5.field277 != -1) {
            arg0 |= 7;
        }
        boolean var10 = ~super.field3427 != arg1 && ~class228.field2707 <= ~super.field3387 && ~super.field3440 < ~class228.field2707;
        if (var10) {
            arg0 |= 524288;
        }
        int var11 = super.field3434.method1100((byte) 25);
        class498 var12 = super.field3460[0] = this.field5003.method2850(class362.field4504, super.field3407, super.field3376, super.field3392, super.field3367, (byte) -87, super.field3368, arg2, this.field4982, super.field3373, class249.field2932, var11, class2.field30, arg0, var6, super.field3409, super.field3435, var7);
        if (var12 == null) {
            return false;
        } else {
            super.field3382 = var12.method404();
            super.field3365 = var12.method394();
            this.method1669(var12, (byte) 114);
            if (~var8 == -1 && ~var9 == -1) {
                this.method1680(arg1 + 1986167010, this.method1665(arg1 ^ -1720746761) << 9, 0, var11, 0, this.method1665(1720746760) << 9);
            } else {
                this.method1680(1986167009, var9, var5.field264, var11, var5.field234, var8);
                if (~super.field3415 != -1) {
                    super.field3460[0].method398(super.field3415);
                }
                if (~super.field3385 != -1) {
                    super.field3460[0].method353(super.field3385);
                }
                if (~super.field3378 != -1) {
                    super.field3460[0].method377(0, super.field3378, 0);
                }
            }
            if (var10) {
                var12.method382(super.field3403, super.field3366, super.field3416, super.field3427 & 255);
            }
            this.method1674(var11, 0, arg2, var8, var4, var5, var9);
            return true;
        }
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(Z)Z", line = 144)
    public final boolean method531(boolean arg0) {
        ++field5007;
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "(Z)I", line = 157)
    public final int method1678(boolean arg0) {
        ++field5005;
        if (this.field5003.field6636 != null) {
            class479 var2 = this.field5003.method2843(class2.field30, 228);
            if (var2 != null && ~var2.field6681 != 0) {
                return var2.field6681;
            }
        }
        if (arg0) {
            this.method1671(false);
        }
        return this.field5003.field6681;
    }

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "(B)V", line = 184)
    public static void method2271(byte arg0) {
        field5008 = null;
        field4979 = null;
        if (arg0 != -47) {
            field4979 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIZIZ)V", line = 198)
    public final void method2272(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        super.field808 = super.field811 = (byte) arg1;
        ++field4981;
        if (class77.method708(arg2, -184949524, arg0)) {
            ++super.field811;
        }
        if (~super.field3420 != 0 && class362.field4504.method3600(-89, super.field3420).field7950 == 1) {
            super.field3430 = null;
            super.field3420 = -1;
        }
        for (int var7 = 0; ~var7 > ~super.field3439.length; ++var7) {
            if (~super.field3439[var7].field9372 != 0) {
                class308 var11 = class740.field10303.method1473(-84, super.field3439[var7].field9372);
                if (var11.field3804 && var11.field3824 != -1 && class362.field4504.method3600(-83, var11.field3824).field7950 == 1) {
                    super.field3439[var7].field9372 = -1;
                }
            }
        }
        if (!arg5) {
            int var8 = arg2 - super.field3453[0];
            int var9 = -super.field3455[0] + arg0;
            if (~var8 <= 7 && var8 <= 8 && ~var9 <= 7 && ~var9 >= -9) {
                if (~super.field3458 > -10) {
                    ++super.field3458;
                }
                for (int var10 = super.field3458; var10 > 0; --var10) {
                    super.field3453[var10] = super.field3453[var10 - 1];
                    super.field3455[var10] = super.field3455[var10 - 1];
                    super.field3459[var10] = super.field3459[var10 + -1];
                }
                super.field3453[0] = arg2;
                super.field3459[0] = 1;
                super.field3455[0] = arg0;
                return;
            }
        }
        super.field3453[0] = arg2;
        super.field3457 = 0;
        super.field3456 = 0;
        if (arg3) {
            this.method2273(103, -58, -77);
        }
        super.field3458 = 0;
        super.field3455[0] = arg0;
        super.field813 = (super.field3455[0] << 9) + (arg4 << 8);
        super.field823 = (super.field3453[0] << 9) + (arg4 << 8);
        if (super.field3452 != null) {
            super.field3452.method4246();
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(Lha;I)V", line = 284)
    public final void method500(class66 arg0, int arg1) {
        ++field4980;
        if (this.field5003 != null) {
            if (arg1 == -1) {
                if (super.field3451 || this.method2270(0, arg1, arg0)) {
                    class778 var3 = arg0.method576();
                    var3.method139(super.field3434.method1100((byte) 25));
                    var3.method131(super.field823, super.field809 + -20, super.field813);
                    this.method1668(-17370, var3, super.field3451, arg0, super.field3460);
                    for (int var4 = 0; ~super.field3460.length < ~var4; ++var4) {
                        super.field3460[var4] = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(Z)V", line = 321)
    public final void method530(boolean arg0) {
        if (arg0) {
            this.method2272(-107, 39, -22, true, -62, false);
        }
        ++field4993;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(III)V", line = 334)
    public final void method2273(int arg0, int arg1, int arg2) {
        ++field4990;
        int var4 = super.field3453[0];
        int var5 = super.field3455[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (~arg1 == -2) {
            ++var5;
            ++var4;
        }
        if (~arg1 == -3) {
            ++var4;
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
        if (arg1 == 7) {
            ++var5;
            --var4;
        }
        if (super.field3420 != -1 && class362.field4504.method3600(arg2 ^ -117, super.field3420).field7950 == 1) {
            super.field3420 = -1;
            super.field3430 = null;
        }
        for (int var6 = 0; var6 < super.field3439.length; ++var6) {
            if (~super.field3439[var6].field9372 != 0) {
                class308 var8 = class740.field10303.method1473(-35, super.field3439[var6].field9372);
                if (var8.field3804 && var8.field3824 != -1 && ~class362.field4504.method3600(arg2 ^ -80, var8.field3824).field7950 == -2) {
                    super.field3439[var6].field9372 = -1;
                }
            }
        }
        if (~super.field3458 > -10) {
            ++super.field3458;
        }
        for (int var7 = super.field3458; ~var7 < -1; --var7) {
            super.field3453[var7] = super.field3453[var7 - 1];
            super.field3455[var7] = super.field3455[var7 + -1];
            super.field3459[var7] = super.field3459[var7 + -1];
        }
        super.field3453[arg2] = var4;
        super.field3459[0] = (byte) arg0;
        super.field3455[0] = var5;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(ILha;)Lrk;", line = 430)
    public final class35 method502(int arg0, class66 arg1) {
        ++field4994;
        if (this.field5003 != null && this.method2270(2048, -1, arg1)) {
            class778 var3 = arg1.method576();
            int var4 = super.field3434.method1100((byte) 25);
            var3.method139(var4);
            class727 var5 = class107.field1351[super.field808][super.field823 >> class714.field10017][super.field813 >> class714.field10017];
            if (var5 != null && var5.field10177 != null) {
                int var6 = -var5.field10177.field4055 + super.field3394;
                super.field3394 = (int) ((float) super.field3394 - (float) var6 / 10.0F);
            } else {
                super.field3394 = (int) ((float) super.field3394 - (float) super.field3394 / 10.0F);
            }
            var3.method131(super.field823, super.field809 - 20 - super.field3394, super.field813);
            class15 var7 = this.method1676(0);
            class479 var8 = this.field5003.field6636 == null ? this.field5003 : this.field5003.method2843(class2.field30, 228);
            super.field3454 = false;
            class35 var9 = null;
            if (~class118.field1503.field10664.method3189(0) == -2 && var8.field6664 && var7.field280) {
                class582 var10 = super.field3420 != -1 && super.field3359 == 0 ? class362.field4504.method3600(-95, super.field3420) : null;
                class582 var11 = ~super.field3399 == 0 || super.field3426 && var10 != null ? null : class362.field4504.method3600(-43, super.field3399);
                class498 var12 = class676.method3808(super.field3378, -18081, this.field5003.field6706 & 255, super.field3460[0], 65535 & this.field5003.field6658, var11 == null ? var10 : var11, arg1, var11 == null ? super.field3392 : super.field3409, this.field5003.field6667 & 255, super.field3385, var4, super.field3415, this.field5003.field6710, this.field5003.field6639 & 65535);
                if (var12 != null) {
                    var9 = class415.method2476(super.field3460.length + 1, (byte) 122, this.method2274((byte) 118));
                    super.field3454 = true;
                    arg1.method635(false);
                    if (!class502.field7084) {
                        var12.method355(var3, var9.field537[super.field3460.length], 0);
                    } else {
                        var12.method388(var3, var9.field537[super.field3460.length], class621.field8528, 0);
                    }
                    arg1.method635(true);
                }
            }
            var3.method139(var4);
            var3.method131(super.field823, -super.field3394 + -5 + super.field809, super.field813);
            if (var9 == null) {
                var9 = class415.method2476(super.field3460.length, (byte) 120, this.method2274((byte) -127));
            }
            this.method1668(-17370, var3, false, arg1, super.field3460);
            if (!class502.field7084) {
                for (int var13 = 0; var13 < super.field3460.length; ++var13) {
                    if (super.field3460[var13] != null) {
                        super.field3460[var13].method355(var3, var9.field537[var13], 0);
                    }
                }
            } else {
                for (int var14 = 0; var14 < super.field3460.length; ++var14) {
                    if (super.field3460[var14] != null) {
                        super.field3460[var14].method388(var3, var9.field537[var14], class621.field8528, 0);
                    }
                }
            }
            if (super.field3452 != null) {
                class460 var15 = super.field3452.method4244();
                if (class502.field7084) {
                    arg1.method590(var15, class621.field8528);
                } else {
                    arg1.method582(var15);
                }
            }
            for (int var16 = 0; super.field3460.length > var16; ++var16) {
                if (super.field3460[var16] != null) {
                    super.field3454 |= super.field3460[var16].method380();
                }
            }
            super.field3460[0] = super.field3460[1] = super.field3460[2] = null;
            int var17 = 1 / ((47 - arg0) / 63);
            super.field3389 = class471.field6571;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "(B)Z", line = 560)
    private final boolean method2274(byte arg0) {
        int var2 = -5 % ((55 - arg0) / 35);
        ++field4991;
        return this.field5003.field6700;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ltd;B)V", line = 575)
    public final void method2275(class479 arg0, byte arg1) {
        this.field5003 = arg0;
        ++field4985;
        if (arg1 < -75) {
            if (this.field5003 != null) {
                this.field4996 = this.field5003.field6709;
                this.field4998 = this.field5003.field6647;
            }
            if (super.field3452 != null) {
                super.field3452.method4246();
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(Z)I", line = 597)
    public final int method499(boolean arg0) {
        if (!arg0) {
            this.method2269((byte) 70);
        }
        ++field5000;
        return this.field5003 == null ? 0 : this.field5003.field6644;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBILha;)Z", line = 613)
    public final boolean method501(int arg0, byte arg1, int arg2, class66 arg3) {
        ++field5001;
        if (this.field5003 != null && this.method2270(131072, -1, arg3)) {
            class778 var5 = arg3.method576();
            int var6 = super.field3434.method1100((byte) 25);
            var5.method139(var6);
            var5.method131(super.field823, super.field809, super.field813);
            boolean var7 = false;
            for (int var8 = 0; var8 < super.field3460.length; ++var8) {
                if (super.field3460[var8] != null) {
                    boolean var10000;
                    label56: {
                        if (~this.field5003.field6644 >= -1) {
                            label54: {
                                if (this.field5003.field6702 == -1) {
                                    if (this.field5003.field6710 == 1) {
                                        break label54;
                                    }
                                    var10000 = false;
                                } else {
                                    if (this.field5003.field6702 == 1) {
                                        break label54;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label56;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (!class502.field7084) {
                        var10 = super.field3460[var8].method363(arg0, arg2, var5, var9, this.field5003.field6644);
                    } else {
                        var10 = super.field3460[var8].method379(arg0, arg2, var5, var9, this.field5003.field6644, class621.field8528);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            if (arg1 < 19) {
                return true;
            } else {
                for (int var11 = 0; ~var11 > ~super.field3460.length; ++var11) {
                    super.field3460[var11] = null;
                }
                return var7;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(III)Z", line = 679)
    public static final boolean method2276(int arg0, int arg1, int arg2) {
        ++field4984;
        if (!class314.method1850(arg2, 108, arg0)) {
            return false;
        } else if (class672.method3779(arg0, -1219194420, arg2) | ~(45056 & arg0) != -1 | class504.method3022(arg2, (byte) -34, arg0)) {
            return true;
        } else {
            return arg1 != -5845 ? true : ~(55 & arg2) == -1 & (class86.method797(103, arg2, arg0) | class427.method2545(65536, arg0, arg2));
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLha;)Loba;", line = 702)
    public final class276 method507(boolean arg0, class66 arg1) {
        if (arg0) {
            this.method499(false);
        }
        ++field4983;
        return null;
    }
}
