import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class459 extends class463 {

    @OriginalMember(owner = "client!vi", name = "Kc", descriptor = "I")
    public int field6315 = -1;

    @OriginalMember(owner = "client!vi", name = "Sc", descriptor = "I")
    public int field6323 = -1;

    @OriginalMember(owner = "client!vi", name = "Yc", descriptor = "[Lav;")
    public static class545[] field6329 = new class545[2048];

    @OriginalMember(owner = "client!vi", name = "gd", descriptor = "[I")
    public static int[] field6337 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!vi", name = "Tc", descriptor = "F")
    public static float field6324;

    @OriginalMember(owner = "client!vi", name = "Gc", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!vi", name = "Hc", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!vi", name = "Ic", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!vi", name = "Jc", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!vi", name = "Lc", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!vi", name = "Mc", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!vi", name = "Nc", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!vi", name = "Oc", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!vi", name = "Qc", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!vi", name = "Rc", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!vi", name = "Uc", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!vi", name = "Wc", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!vi", name = "Xc", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!vi", name = "Zc", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!vi", name = "ad", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!vi", name = "cd", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!vi", name = "ed", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!vi", name = "fd", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!vi", name = "dd", descriptor = "Ltn;")
    public class74 field6334;

    @OriginalMember(owner = "client!vi", name = "Pc", descriptor = "Lra;")
    public static class90 field6320;

    @OriginalMember(owner = "client!vi", name = "bd", descriptor = "[I")
    public static int[] field6332;

    @OriginalMember(owner = "client!vi", name = "Vc", descriptor = "[[Let;")
    public static class509[][] field6326;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "(I)I", line = 5)
    public final int method2671(int arg0) {
        ++field6314;
        if (this.field6334.field800 != null) {
            class74 var2 = this.field6334.method420(class281.field3700, 107);
            if (var2 != null && var2.field808 != -1) {
                return var2.field808;
            }
        }
        return arg0 < 58 ? -104 : this.field6334.field808;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(ZII)V", line = 29)
    public final void method2672(boolean arg0, int arg1, int arg2) {
        ++field6318;
        int var4 = super.field6483[0];
        if (arg0) {
            this.method2676((byte) 97);
        }
        int var5 = super.field6491[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (~arg1 == -2) {
            ++var4;
            ++var5;
        }
        if (~arg1 == -3) {
            ++var4;
        }
        if (arg1 == 3) {
            ++var4;
            --var5;
        }
        if (arg1 == 4) {
            --var5;
        }
        if (arg1 == 5) {
            --var4;
            --var5;
        }
        if (arg1 == 6) {
            --var4;
        }
        if (super.field6465 != -1 && class393.field5190.method770(super.field6465, -92).field6962 == 1) {
            super.field6465 = -1;
        }
        if (arg1 == 7) {
            --var4;
            ++var5;
        }
        if (super.field6400 != -1) {
            class356 var6 = class344.field4461.method1393(64, super.field6400);
            if (var6.field4657 && ~var6.field4667 != 0 && class393.field5190.method770(var6.field4667, -58).field6962 == 1) {
                super.field6400 = -1;
            }
        }
        if (super.field6397 != -1) {
            class356 var7 = class344.field4461.method1393(64, super.field6397);
            if (var7.field4657 && ~var7.field4667 != 0 && ~class393.field5190.method770(var7.field4667, -69).field6962 == -2) {
                super.field6397 = -1;
            }
        }
        if (super.field6486 < 9) {
            ++super.field6486;
        }
        for (int var8 = super.field6486; var8 > 0; --var8) {
            super.field6483[var8] = super.field6483[var8 + -1];
            super.field6491[var8] = super.field6491[var8 + -1];
            super.field6482[var8] = super.field6482[var8 + -1];
        }
        super.field6483[0] = var4;
        super.field6482[0] = (byte) arg2;
        super.field6491[0] = var5;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)Z", line = 123)
    public final boolean method2673(boolean arg0) {
        ++field6327;
        if (this.field6334 == null) {
            return false;
        } else {
            return arg0 ? true : true;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILqa;)V", line = 141)
    public final void method326(int arg0, class206 arg1) {
        if (arg0 != 29657) {
            this.method2680(true, 73, 18, (byte) 4, -28, -46);
        }
        ++field6336;
        if (this.field6334 != null) {
            if (super.field6488 || this.method2679((byte) 79, 0, arg1)) {
                this.method2702(super.field6488, 4, arg1, super.field6485);
                super.field6485[0] = super.field6485[1] = super.field6485[2] = super.field6485[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ltn;I)V", line = 167)
    public final void method2674(class74 arg0, int arg1) {
        this.field6334 = arg0;
        ++field6319;
        if (arg1 != 0) {
            field6332 = null;
        }
        if (super.field6490 != null) {
            super.field6490.method2657();
        }
    }

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "(I)Z", line = 181)
    private final boolean method2675(int arg0) {
        if (arg0 <= 45) {
            return false;
        } else {
            ++field6328;
            return this.field6334.field809;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)I", line = 192)
    public final int method2676(byte arg0) {
        ++field6333;
        if (this.field6334.field800 != null) {
            class74 var2 = this.field6334.method420(class281.field3700, 92);
            if (var2 != null && ~var2.field862 != 0) {
                return var2.field862;
            }
        }
        if (arg0 != 64) {
            field6324 = -1.437778F;
        }
        return ~this.field6334.field862 == 0 ? super.method2676((byte) 64) : this.field6334.field862;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLoe;ILqa;III)V", line = 215)
    public final void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6) {
        if (arg5 == 13915) {
            ++field6322;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILqa;II)Z", line = 226)
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        ++field6321;
        if (this.field6334 != null && this.method2679((byte) 79, 131072, arg1)) {
            class163 var5 = arg1.method1126();
            if (arg0 != -21851) {
                this.field6334 = null;
            }
            int var6 = super.field6412.method962(-113);
            var5.method664(var6);
            var5.method655(super.field8661, super.field8649, super.field8652);
            boolean var7 = false;
            for (int var8 = 0; ~var8 > ~super.field6485.length; ++var8) {
                if (super.field6485[var8] != null && super.field6485[var8].method91(arg2, arg3, var5, ~this.field6334.field844 == -2)) {
                    var7 = true;
                    break;
                }
            }
            super.field6485[0] = super.field6485[1] = super.field6485[2] = super.field6485[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V", line = 267)
    public static final void method2677(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        ++field6312;
        class557.field8210 = arg0;
        class546.field8042 = new class455[class230.field2853[class557.field8210] + 1];
        class413.field5364 = 0;
        if (arg1 != 2) {
            method2681(false);
        }
        class48.field402 = 0;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(ILqa;)Loj;", line = 285)
    public final class318 method320(int arg0, class206 arg1) {
        ++field6317;
        if (this.field6334 != null && this.method2679((byte) 79, 2048, arg1)) {
            class163 var3 = arg1.method1126();
            int var4 = super.field6412.method962(-79);
            if (arg0 != -1) {
                return null;
            } else {
                var3.method664(var4);
                var3.method655(super.field8661, super.field8649, super.field8652);
                class352 var5 = this.method2704(0);
                class74 var6 = this.field6334.field800 == null ? this.field6334 : this.field6334.method420(class281.field3700, 92);
                if (class565.field8299.field2186 && var6.field799 && var5.field4541) {
                    class502 var7 = super.field6465 != -1 && super.field6449 == 0 ? class393.field5190.method770(super.field6465, -118) : null;
                    class502 var8 = super.field6474 == -1 || super.field6430 && var7 != null ? null : class393.field5190.method770(super.field6474, -63);
                    int var9 = 0;
                    if (super.field6435 != 0) {
                        var9 = this.method2701((byte) -98);
                    }
                    class157 var10 = class410.method2345(var8 == null ? super.field6390 : super.field6403, var9, this.field6334.field802 & 65535, var8 == null ? var7 : var8, 255 & this.field6334.field798, super.field6456, super.field6421, 65535 & this.field6334.field801, super.field6485[0], (byte) -122, this.field6334.field844, super.field6455, 255 & this.field6334.field841, var4, arg1);
                    if (var10 != null) {
                        float var11 = arg1.method1167();
                        float var12 = arg1.method1186();
                        arg1.method1181(false);
                        arg1.method1106(var11, var12 + -150.0F);
                        var10.method69(var3, (class517) null, 0);
                        arg1.method1106(var11, var12);
                        arg1.method1181(true);
                    }
                }
                class318 var13 = null;
                if (this.method2675(arg0 ^ -121)) {
                    var13 = class143.method788(~arg0, super.field6485.length);
                }
                if (super.field6490 == null) {
                    arg1.method273(super.field6485, var3, var13 == null ? null : var13.field4059, 0);
                } else {
                    class400 var14 = super.field6490.method2650();
                    arg1.method270(super.field6485, var14, var3, var13 == null ? null : var13.field4059, 0);
                }
                this.method2702(false, 4, arg1, super.field6485);
                super.field6460 = class631.field9087;
                super.field6485[0] = super.field6485[1] = super.field6485[2] = super.field6485[3] = null;
                return var13;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(ILqa;)Lso;", line = 365)
    public final class398 method328(int arg0, class206 arg1) {
        if (arg0 != 12) {
            return null;
        } else {
            ++field6325;
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)I", line = 376)
    public final int method2678(boolean arg0) {
        ++field6313;
        if (arg0) {
            this.field6323 = -48;
        }
        if (this.field6334.field800 != null) {
            class74 var2 = this.field6334.method420(class281.field3700, 92);
            if (var2 != null && ~var2.field797 != 0) {
                return var2.field797;
            }
        }
        return this.field6334.field797;
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)I", line = 397)
    public final int method322(int arg0) {
        ++field6335;
        if (arg0 != 64) {
            this.method317(42);
        }
        return super.field6407;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BILqa;)Z", line = 408)
    private final boolean method2679(byte arg0, int arg1, class206 arg2) {
        ++field6316;
        int var4 = arg1;
        class352 var5 = this.method2704(0);
        class502 var6 = super.field6465 != -1 && ~super.field6449 == -1 ? class393.field5190.method770(super.field6465, -66) : null;
        class502 var7 = ~super.field6474 == 0 || super.field6430 && var6 != null ? null : class393.field5190.method770(super.field6474, arg0 ^ -63);
        int var8 = var5.field4549;
        int var9 = var5.field4544;
        if (var8 != 0 || var9 != 0 || var5.field4552 != 0 || ~var5.field4569 != -1) {
            arg1 |= 7;
        }
        boolean var10 = ~super.field6419 != -1 && ~class335.field4358 <= ~super.field6425 && ~class335.field4358 > ~super.field6447;
        if (var10) {
            arg1 |= 524288;
        }
        class157 var11 = super.field6485[0] = this.field6334.method424(super.field6390, super.field6429, super.field6404, (byte) 107, class393.field5190, arg1, var6, arg2, super.field6403, class281.field3700, super.field6411, super.field6477, var7, class16.field125, super.field6409);
        if (var11 == null) {
            return false;
        } else {
            super.field6407 = var11.method74();
            if (arg0 != 79) {
                return false;
            } else {
                this.method2700(var11, 13457);
                int var12 = super.field6412.method962(-124);
                if (~var8 == -1 && var9 == 0) {
                    this.method2703(arg0 + -187, this.method2694(28146) << 7, 0, var12, this.method2694(28146) << 7, 0);
                } else {
                    this.method2703(arg0 ^ -25, var9, var5.field4548, var12, var8, var5.field4579);
                    if (super.field6455 != 0) {
                        super.field6485[0].method85(super.field6455);
                    }
                    if (~super.field6456 != -1) {
                        super.field6485[0].method79(super.field6456);
                    }
                    if (~super.field6421 != -1) {
                        super.field6485[0].method98(0, super.field6421, 0);
                    }
                }
                if (var10) {
                    var11.method76(super.field6434, super.field6452, super.field6450, 255 & super.field6419);
                }
                if (~super.field6400 != 0 && super.field6469 != -1) {
                    class356 var13 = class344.field4461.method1393(64, super.field6400);
                    boolean var14 = var13.field4677 == 3 && (~var8 != -1 || var9 != 0);
                    int var15 = var4;
                    if (!var14) {
                        if (super.field6444 != 0) {
                            var15 = var4 | 5;
                        }
                        if (super.field6420 != 0) {
                            var15 |= 2;
                        }
                    } else {
                        var15 = var4 | 7;
                    }
                    class157 var16 = super.field6485[1] = var13.method2005(-21838, super.field6398, super.field6470, var15, arg2, class393.field5190, super.field6469);
                    if (var16 != null) {
                        if (~super.field6420 != -1) {
                            var16.method98(0, -super.field6420 << 0, 0);
                        }
                        if (super.field6444 != 0) {
                            var16.method92(super.field6444 * 2048);
                        }
                        if (var14) {
                            if (~super.field6455 != -1) {
                                var16.method85(super.field6455);
                            }
                            if (~super.field6456 != -1) {
                                var16.method79(super.field6456);
                            }
                            if (super.field6421 != 0) {
                                var16.method98(0, super.field6421, 0);
                            }
                        }
                    }
                } else {
                    super.field6485[1] = null;
                }
                if (~super.field6397 != 0 && ~super.field6454 != 0) {
                    class356 var17 = class344.field4461.method1393(arg0 ^ 15, super.field6397);
                    boolean var18 = ~var17.field4677 == -4 && (~var8 != -1 || ~var9 != -1);
                    int var19 = var4;
                    if (!var18) {
                        if (super.field6386 != 0) {
                            var19 = var4 | 5;
                        }
                        if (super.field6458 != 0) {
                            var19 |= 2;
                        }
                    } else {
                        var19 = var4 | 7;
                    }
                    class157 var20 = super.field6485[3] = var17.method2007(super.field6387, var19, class393.field5190, 51, arg2, super.field6416, super.field6454);
                    if (var20 != null) {
                        if (super.field6458 != 0) {
                            var20.method98(0, -super.field6458 << 0, 0);
                        }
                        if (~super.field6386 != -1) {
                            var20.method92(super.field6386 * 2048);
                        }
                        if (var18) {
                            if (~super.field6455 != -1) {
                                var20.method85(super.field6455);
                            }
                            if (super.field6456 != 0) {
                                var20.method79(super.field6456);
                            }
                            if (super.field6421 != 0) {
                                var20.method98(0, super.field6421, 0);
                            }
                        }
                    }
                } else {
                    super.field6485[3] = null;
                }
                super.field6485[2] = null;
                if (super.field6484 != null) {
                    if (~super.field6484.field5892 < ~class335.field4358) {
                        if (~class335.field4358 <= ~super.field6484.field5887) {
                            class157 var21 = super.field6484.method2509(var4 | 7, (byte) 83, arg2);
                            if (var21 != null) {
                                var21.method98(super.field6484.field5888 - super.field8661, super.field6484.field5886 - super.field8649, super.field6484.field5880 - super.field8652);
                                if (~var12 != -1) {
                                    var21.method92(var12);
                                }
                                super.field6485[2] = var21;
                            }
                        }
                    } else {
                        super.field6484 = null;
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)Z", line = 604)
    public final boolean method317(int arg0) {
        ++field6311;
        if (arg0 != 64) {
            this.method2671(98);
        }
        return false;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZIIBII)V", line = 627)
    public final void method2680(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        super.field8660 = (byte) arg4;
        ++field6331;
        if (super.field6465 != -1 && ~class393.field5190.method770(super.field6465, -78).field6962 == -2) {
            super.field6465 = -1;
        }
        if (~super.field6400 != 0) {
            class356 var7 = class344.field4461.method1393(64, super.field6400);
            if (var7.field4657 && ~var7.field4667 != 0 && ~class393.field5190.method770(var7.field4667, -91).field6962 == -2) {
                super.field6400 = -1;
            }
        }
        if (super.field6397 != -1) {
            class356 var8 = class344.field4461.method1393(64, super.field6397);
            if (var8.field4657 && var8.field4667 != -1 && class393.field5190.method770(var8.field4667, -121).field6962 == 1) {
                super.field6397 = -1;
            }
        }
        if (!arg0) {
            int var9 = -super.field6483[0] + arg2;
            int var10 = arg5 - super.field6491[0];
            if (~var9 <= 7 && var9 <= 8 && ~var10 <= 7 && var10 <= 8) {
                if (super.field6486 < 9) {
                    ++super.field6486;
                }
                for (int var11 = super.field6486; var11 > 0; --var11) {
                    super.field6483[var11] = super.field6483[var11 - 1];
                    super.field6491[var11] = super.field6491[var11 + -1];
                    super.field6482[var11] = super.field6482[var11 - 1];
                }
                super.field6483[0] = arg2;
                super.field6491[0] = arg5;
                super.field6482[0] = 1;
                return;
            }
        }
        super.field6487 = 0;
        super.field6489 = 0;
        super.field6486 = 0;
        super.field6483[0] = arg2;
        super.field6491[0] = arg5;
        super.field8652 = (super.field6491[0] << 7) + (arg1 << 6);
        super.field8661 = (super.field6483[0] << 7) + (arg1 << 6);
        if (super.field6490 != null) {
            super.field6490.method2657();
        }
        if (arg3 != -116) {
            this.method320(-104, (class206) null);
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(Z)V", line = 706)
    public static void method2681(boolean arg0) {
        field6337 = null;
        field6329 = null;
        field6320 = null;
        field6332 = null;
        field6326 = null;
        if (!arg0) {
            method2681(true);
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V", line = 723)
    public final void method314(byte arg0) {
        if (arg0 > 23) {
            ++field6330;
            throw new IllegalStateException();
        }
    }
}
