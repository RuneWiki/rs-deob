import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class198 extends class374 {

    @OriginalMember(owner = "client!km", name = "Bc", descriptor = "I")
    public static int field2733 = 0;

    @OriginalMember(owner = "client!km", name = "Vc", descriptor = "[Lpg;")
    public static class437[] field2753 = new class437[0];

    @OriginalMember(owner = "client!km", name = "Cc", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!km", name = "Dc", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!km", name = "Ec", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!km", name = "Gc", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!km", name = "Hc", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!km", name = "Ic", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!km", name = "Jc", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!km", name = "Kc", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!km", name = "Lc", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!km", name = "Mc", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!km", name = "Nc", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!km", name = "Oc", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!km", name = "Pc", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!km", name = "Qc", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!km", name = "Rc", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!km", name = "Sc", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!km", name = "Tc", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!km", name = "Uc", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!km", name = "Wc", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!km", name = "Xc", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!km", name = "Yc", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!km", name = "Zc", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!km", name = "Fc", descriptor = "Lgh;")
    public class327 field2737;

    // $FF: synthetic field
    @OriginalMember(owner = "client!km", name = "ad", descriptor = "Ljava/lang/Class;")
    public static Class field2758;

    // $FF: synthetic method
    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1298(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(B)Z", line = 4)
    public final boolean method1287(byte arg0) {
        ++field2757;
        if (this.field2737 == null) {
            return false;
        } else {
            if (arg0 != -6) {
                field2753 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Luo;I)V", line = 19)
    public final void method678(class345 arg0, int arg1) {
        if (arg1 == -22948) {
            ++field2747;
            if (this.field2737 != null) {
                if (super.field5340 || this.method1294(arg0, 110, 0)) {
                    this.method2387(super.field5340, arg0, super.field5325, (byte) 107);
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(B)V", line = 43)
    public final void method674(byte arg0) {
        if (arg0 == -1) {
            ++field2735;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLuo;)Laj;", line = 54)
    public final class170 method681(boolean arg0, class345 arg1) {
        ++field2756;
        if (this.field2737 != null && this.method1294(arg1, 123, 1024)) {
            class417 var3 = arg1.method84();
            int var4 = super.field5269.method608(16383);
            var3.method698(var4);
            if (!arg0) {
                this.method1290((byte) -47, (class327) null);
            }
            var3.method696(super.field6262, super.field6270, super.field6266);
            class428 var5 = this.method2388(125);
            class327 var6 = this.field2737.field4475 == null ? this.field2737 : this.field2737.method2108(true);
            if (class106.field1472 && var6.field4514 && var5.field6043) {
                class411 var7 = ~super.field5264 != 0 && super.field5251 == 0 ? class108.method761((byte) -82, super.field5264) : null;
                class411 var8 = ~super.field5297 == 0 || super.field5280 && var7 != null ? null : class108.method761((byte) -82, super.field5297);
                class394 var9 = class397.method2512(super.field5310, super.field5325[0], 0, this.field2737.field4488, arg1, 65535 & this.field2737.field4464, 255 & this.field2737.field4471, 65535 & this.field2737.field4519, super.field5283, var8 == null ? super.field5319 : super.field5273, super.field5315, var8 != null ? var8 : var7, var4, 255 & this.field2737.field4474, super.field5254);
                if (var9 != null) {
                    float var10 = arg1.method106();
                    float var11 = arg1.method97();
                    arg1.method96(false);
                    arg1.method80(var10, var11 + -150.0F);
                    var9.method1416(var3, (class84) null, 0);
                    arg1.method80(var10, var11);
                    arg1.method96(true);
                }
            }
            class170 var12 = null;
            if (this.method1289(-1)) {
                var12 = class175.method1152((byte) 72, super.field5325.length);
            }
            if (super.field5336 != null) {
                class77 var13 = super.field5336.method2017();
                arg1.method123(super.field5325, var13, var3, var12 != null ? var12.field2333 : null, 0);
            } else {
                arg1.method79(super.field5325, var3, var12 == null ? null : var12.field2333, 0);
            }
            this.method2387(false, arg1, super.field5325, (byte) 107);
            if (super.field5325[2] != null) {
                if (~var4 != -1) {
                    super.field5325[2].method1441(var4);
                }
                super.field5325[2].method1455(super.field6262 - super.field5334, -super.field5342 + super.field6270, super.field6266 - super.field5329);
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "g", descriptor = "(B)V", line = 130)
    public static void method1288(byte arg0) {
        field2753 = null;
        int var1 = -75 % ((53 - arg0) / 35);
    }

    @OriginalMember(owner = "client!km", name = "j", descriptor = "(I)Z", line = 139)
    private final boolean method1289(int arg0) {
        if (arg0 != -1) {
            this.method1289(-29);
        }
        ++field2754;
        return this.field2737.field4506;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLgh;)V", line = 156)
    public final void method1290(byte arg0, class327 arg1) {
        if (arg0 != 114) {
            field2733 = 101;
        }
        ++field2734;
        this.field2737 = arg1;
        if (super.field5336 != null) {
            super.field5336.method2024();
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIILuo;)V", line = 171)
    public static final void method1291(int arg0, int arg1, int arg2, int arg3, int arg4, class345 arg5) {
        ++field2752;
        arg5.method136(arg0, arg3, arg0 - -arg4, arg2 + arg3);
        arg5.method2182(arg0, arg3, arg4, -16777216, arg1 ^ 115, arg2);
        if (class89.field1244 >= 100) {
            float var6 = (float) class354.field4857 / (float) class354.field4841;
            int var7 = arg4;
            int var8 = arg2;
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg4 * var6);
            } else {
                var7 = (int) ((float) arg2 / var6);
            }
            int var9 = (-var7 + arg4) / 2 + arg0;
            int var10 = (-var8 + arg2) / 2 + arg3;
            if (class393.field5637 == null || ~class393.field5637.method600() != ~arg4 || class393.field5637.method598() != arg2) {
                class354.method2260(class354.field4843, class354.field4858 + class354.field4857, class354.field4843 + class354.field4841, class354.field4858, var9, var10, var7 + var9, var8 + var10);
                class354.method2273(arg5);
                class393.field5637 = arg5.method117(var9, var10, var7, var8, false);
            }
            class393.field5637.method1501(var9, var10);
            int var11 = class181.field2485 * var7 / class354.field4841;
            int var12 = class34.field536 * var8 / class354.field4857;
            int var13 = class75.field1077 * var7 / class354.field4841 + var9;
            int var14 = var10 - class94.field1304 * var8 / class354.field4857 + -var12 + var8;
            int var15 = -1996554240;
            if (~class129.field1827 == -2) {
                var15 = -1996488705;
            }
            arg5.method56(var13, var14, var11, var12, var15, 1);
            arg5.method59(var13, var14, var11, var12, var15, arg1);
            if (~class222.field3105 < -1) {
                int var16;
                if (class377.field5396 > 50) {
                    var16 = (-class377.field5396 + 100) * 5;
                } else {
                    var16 = class377.field5396 * 5;
                }
                for (class62 var17 = (class62) class354.field4833.method646(48); var17 != null; var17 = (class62) class354.field4833.method641(false)) {
                    class25 var18 = class328.method2113(var17.field851, (byte) -125);
                    if (class135.method945(var18, true)) {
                        if (class352.field4820 != var17.field851) {
                            if (~class223.field3122 != 0 && class223.field3122 == var18.field429) {
                                int var19 = var9 - -(var17.field852 * var7 / class354.field4841);
                                int var20 = var10 - -((-var17.field858 + class354.field4857) * var8 / class354.field4857);
                                arg5.method2182(var19 + -2, var20 + -2, 4, 16776960 | var16 << 24, arg1 + 76, 4);
                            }
                        } else {
                            int var21 = var17.field852 * var7 / class354.field4841 + var9;
                            int var22 = var10 - -((-var17.field858 + class354.field4857) * var8 / class354.field4857);
                            arg5.method2182(var21 - 2, var22 + -2, 4, var16 << 24 | 16776960, -77, 4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "h", descriptor = "(I)I", line = 264)
    public final int method1292(int arg0) {
        if (arg0 != 0) {
            this.method681(true, (class345) null);
        }
        ++field2746;
        if (this.field2737.field4475 != null) {
            class327 var2 = this.field2737.method2108(true);
            if (var2 != null && ~var2.field4496 != 0) {
                return var2.field4496;
            }
        }
        return this.field2737.field4496 != -1 ? this.field2737.field4496 : super.method1292(0);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lkh;B)V", line = 291)
    public static final void method1293(class11 arg0, byte arg1) {
        ++field2751;
        if (arg1 <= 116) {
            method1293((class11) null, (byte) -71);
        }
        if (~(arg0.field230.length + -arg0.field191) <= -2) {
            int var2 = arg0.method172((byte) 52);
            if (var2 >= 0 && var2 <= 1) {
                if (arg0.field230.length - arg0.field191 >= 2) {
                    int var3 = arg0.method174(255);
                    if (~(var3 * 6) == ~(arg0.field230.length + -arg0.field191)) {
                        while (true) {
                            int var4;
                            int var5;
                            do {
                                do {
                                    do {
                                        if (arg0.field230.length <= arg0.field191) {
                                            return;
                                        }
                                        var4 = arg0.method174(255);
                                        var5 = arg0.method185(25239);
                                    } while (~class389.field5580.length >= ~var4);
                                } while (!class15.field291[var4]);
                            } while (~class117.method810(7, var4).field5848 == -50 && (~var5 > 0 || var5 > 1));
                            class389.field5580[var4] = var5;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(B)Z", line = 335)
    public final boolean method683(byte arg0) {
        ++field2749;
        int var2 = 93 / ((arg0 - 47) / 47);
        return false;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Luo;II)Z", line = 345)
    private final boolean method1294(class345 arg0, int arg1, int arg2) {
        ++field2739;
        int var4 = arg2;
        class428 var5 = this.method2388(116);
        class411 var6 = super.field5264 != -1 && ~super.field5251 == -1 ? class108.method761((byte) -82, super.field5264) : null;
        class411 var7 = ~super.field5297 == 0 || super.field5280 && var6 != null ? null : class108.method761((byte) -82, super.field5297);
        int var8 = var5.field6032;
        int var9 = var5.field6059;
        if (~var8 != -1 || var9 != 0 || ~var5.field6062 != -1 || var5.field6023 != 0) {
            arg2 |= 7;
        }
        class394 var10 = super.field5325[0] = this.field2737.method2111(super.field5270, 108, super.field5296, arg2, var7, arg0, super.field5319, super.field5256, super.field5266, super.field5255, super.field5273, var6);
        if (var10 == null) {
            return false;
        } else {
            super.field5262 = var10.method1443();
            this.method2391(var10, 2);
            int var11 = super.field5269.method608(16383);
            super.field5310 = 0;
            super.field5315 = 0;
            super.field5254 = 0;
            if (arg1 < 94) {
                field2743 = 49;
            }
            if (var8 == 0 && var9 == 0) {
                this.method2382(var11, this.method942(false) << 7, this.method942(false) << 7, (byte) 10);
            } else {
                this.method2382(var11, var9, var8, (byte) 10);
                if (~super.field5254 != -1) {
                    super.field5325[0].method1413(super.field5254);
                }
                if (super.field5310 != 0) {
                    super.field5325[0].method1427(super.field5310);
                }
                if (~super.field5315 != -1) {
                    super.field5325[0].method1455(0, super.field5315, 0);
                }
            }
            super.field5325[1] = null;
            if (super.field5300 != -1 && ~super.field5295 != 0) {
                class80 var12 = class393.method2484(super.field5300, -120);
                class394 var13 = var12.method580(super.field5295, -1172, arg0, var4 | (var12.field1136 ? 7 : 2), super.field5316, super.field5257);
                if (var13 != null) {
                    var13.method1455(0, -super.field5288, 0);
                    if (var12.field1136 && (~var8 != -1 || var9 != 0)) {
                        if (~super.field5254 != -1) {
                            var13.method1413(super.field5254);
                        }
                        if (super.field5310 != 0) {
                            var13.method1427(super.field5310);
                        }
                        if (super.field5315 != 0) {
                            var13.method1455(0, super.field5315, 0);
                        }
                    }
                    super.field5325[1] = var13;
                }
            }
            super.field5325[2] = null;
            if (super.field5343 != null) {
                if (~super.field5333 >= ~class276.field3837) {
                    super.field5343 = null;
                }
                if (class276.field3837 >= super.field5331 && ~class276.field3837 > ~super.field5333) {
                    class394 var14 = super.field5343.method685(var4 | 7, arg0, -9380);
                    if (var14 != null) {
                        var14.method1455(super.field5334 - super.field6262, -super.field6270 + super.field5342, -super.field6266 + super.field5329);
                        if (~var11 != -1) {
                            var14.method1441(var11);
                        }
                        super.field5325[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(B)I", line = 459)
    public final int method915(byte arg0) {
        ++field2745;
        int var2 = 8 % ((arg0 - 34) / 56);
        return super.field5262;
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)I", line = 472)
    public final int method937(int arg0) {
        ++field2748;
        if (this.field2737.field4475 != null) {
            class327 var2 = this.field2737.method2108(true);
            if (var2 != null && ~var2.field4515 != 0) {
                return var2.field4515;
            }
        }
        if (arg0 != 1) {
            this.method681(false, (class345) null);
        }
        return this.field2737.field4515;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V", line = 496)
    public final void method1295(int arg0, int arg1, int arg2) {
        ++field2738;
        int var4 = super.field5326[0];
        if (arg2 == -15554) {
            int var5 = super.field5332[0];
            if (arg1 == 0) {
                ++var5;
            }
            if (~arg1 == -2) {
                ++var5;
                ++var4;
            }
            if (arg1 == 2) {
                ++var4;
            }
            if (arg1 == 3) {
                --var5;
                ++var4;
            }
            if (~arg1 == -5) {
                --var5;
            }
            if (~arg1 == -6) {
                --var4;
                --var5;
            }
            if (~arg1 == -7) {
                --var4;
            }
            if (~super.field5264 != 0 && ~class108.method761((byte) -82, super.field5264).field5817 == -2) {
                super.field5264 = -1;
            }
            if (arg1 == 7) {
                ++var5;
                --var4;
            }
            if (~super.field5300 != 0) {
                class80 var6 = class393.method2484(super.field5300, -56);
                if (var6.field1144 && ~var6.field1125 != 0 && ~class108.method761((byte) -82, var6.field1125).field5817 == -2) {
                    super.field5300 = -1;
                }
            }
            if (super.field5344 < 9) {
                ++super.field5344;
            }
            for (int var7 = super.field5344; ~var7 < -1; --var7) {
                super.field5326[var7] = super.field5326[var7 + -1];
                super.field5332[var7] = super.field5332[var7 + -1];
                super.field5337[var7] = super.field5337[var7 + -1];
            }
            super.field5326[0] = var4;
            super.field5332[0] = var5;
            super.field5337[0] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "client!km", name = "h", descriptor = "(B)V", line = 582)
    public static final void method1296(byte arg0) {
        class251.field3547 = -1;
        class50.field697 = -1;
        if (arg0 > -89) {
            field2753 = null;
        }
        class53.field743 = 0;
        ++field2742;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I", line = 595)
    public final int method933(int arg0) {
        ++field2741;
        if (arg0 <= 48) {
            return -26;
        } else {
            if (this.field2737.field4475 != null) {
                class327 var2 = this.field2737.method2108(true);
                if (var2 != null && var2.field4465 != -1) {
                    return var2.field4465;
                }
            }
            return this.field2737.field4465;
        }
    }

    @OriginalMember(owner = "client!km", name = "k", descriptor = "(I)V", line = 617)
    public static final void method1297(int arg0) {
        if (arg0 != -1766) {
            field2736 = 35;
        }
        ++field2740;
        if (class294.field4112 == 2) {
            class445.field6242 = 96;
        } else {
            try {
                Method var1 = (field2758 != null ? field2758 : (field2758 = method1298("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class445.field6242 = 1 + (int) (var3 / 1048576L);
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IILuo;I)Z", line = 653)
    public final boolean method675(int arg0, int arg1, class345 arg2, int arg3) {
        ++field2750;
        if (this.field2737 != null && this.method1294(arg2, 118, 65536)) {
            class417 var5 = arg2.method84();
            int var6 = super.field5269.method608(16383);
            var5.method698(var6);
            if (arg1 != -20759) {
                field2753 = null;
            }
            var5.method696(super.field6262, super.field6270, super.field6266);
            for (int var7 = 0; ~var7 > ~super.field5325.length; ++var7) {
                if (super.field5325[var7] != null && super.field5325[var7].method1465(arg3, arg0, var5, this.field2737.field4488 == 1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IBIILrr;Luo;Z)V", line = 687)
    public final void method679(int arg0, byte arg1, int arg2, int arg3, class203 arg4, class345 arg5, boolean arg6) {
        if (arg1 != -126) {
            this.method937(-56);
        }
        ++field2755;
        throw new IllegalStateException();
    }
}
