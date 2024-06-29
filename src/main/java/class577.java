import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class577 extends class425 {

    @OriginalMember(owner = "client!paa", name = "Qc", descriptor = "I")
    public int field8116 = -1;

    @OriginalMember(owner = "client!paa", name = "ad", descriptor = "I")
    public int field8126 = -1;

    @OriginalMember(owner = "client!paa", name = "Oc", descriptor = "I")
    public static int field8114 = -1;

    @OriginalMember(owner = "client!paa", name = "ed", descriptor = "[[F")
    public static float[][] field8130 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!paa", name = "cd", descriptor = "Ltf;")
    public static class264 field8128 = new class264(0, 17);

    @OriginalMember(owner = "client!paa", name = "Ic", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!paa", name = "Jc", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!paa", name = "Kc", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!paa", name = "Lc", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!paa", name = "Mc", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!paa", name = "Nc", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!paa", name = "Pc", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!paa", name = "Rc", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!paa", name = "Sc", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!paa", name = "Tc", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!paa", name = "Uc", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!paa", name = "Wc", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!paa", name = "Xc", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!paa", name = "Yc", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!paa", name = "Zc", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!paa", name = "bd", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!paa", name = "fd", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!paa", name = "gd", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!paa", name = "hd", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!paa", name = "id", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!paa", name = "jd", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!paa", name = "Vc", descriptor = "Lav;")
    public class592 field8121;

    @OriginalMember(owner = "client!paa", name = "dd", descriptor = "Ljava/lang/Object;")
    public static Object field8129;

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "(B)Z")
    public static final boolean method3266(byte arg0) {
        if (arg0 != -65) {
            field8114 = 37;
        }
        ++field8134;
        return class120.field1828;
    }

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "(I)Z")
    public final boolean method951(int arg0) {
        if (arg0 > -26) {
            field8130 = null;
        }
        ++field8131;
        return false;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BII)V")
    public final void method3267(byte arg0, int arg1, int arg2) {
        ++field8133;
        int var4 = super.field6271[0];
        int var5 = super.field6262[0];
        if (arg2 == 0) {
            ++var5;
        }
        if (arg2 == 1) {
            ++var4;
            ++var5;
        }
        if (arg2 == 2) {
            ++var4;
        }
        if (~arg2 == -4) {
            --var5;
            ++var4;
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
        if (arg0 <= -103) {
            if (arg2 == 7) {
                ++var5;
                --var4;
            }
            if (~super.field6218 != 0 && ~class188.field2708.method2140(super.field6218, 124).field448 == -2) {
                super.field6218 = -1;
                super.field6259 = null;
            }
            if (~super.field6227 != 0) {
                class309 var6 = class86.field1411.method1475((byte) -74, super.field6227);
                if (var6.field4584 && var6.field4566 != -1 && ~class188.field2708.method2140(var6.field4566, 126).field448 == -2) {
                    super.field6227 = -1;
                }
            }
            if (~super.field6172 != 0) {
                class309 var7 = class86.field1411.method1475((byte) -74, super.field6172);
                if (var7.field4584 && var7.field4566 != -1 && class188.field2708.method2140(var7.field4566, 125).field448 == 1) {
                    super.field6172 = -1;
                }
            }
            if (super.field6269 < 9) {
                ++super.field6269;
            }
            for (int var8 = super.field6269; var8 > 0; --var8) {
                super.field6271[var8] = super.field6271[var8 - 1];
                super.field6262[var8] = super.field6262[var8 - 1];
                super.field6265[var8] = super.field6265[var8 + -1];
            }
            super.field6271[0] = var4;
            super.field6265[0] = (byte) arg1;
            super.field6262[0] = var5;
        }
    }

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "(I)I")
    public final int method2560(int arg0) {
        ++field8117;
        if (arg0 != -1) {
            return -6;
        } else {
            if (this.field8121.field8315 != null) {
                class592 var2 = this.field8121.method3356(81, class61.field1163);
                if (var2 != null && ~var2.field8332 != 0) {
                    return var2.field8332;
                }
            }
            return this.field8121.field8332;
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(ILr;)Lnu;")
    public final class548 method1183(int arg0, class166 arg1) {
        ++field8127;
        if (arg0 != 6433) {
            field8130 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "(B)Z")
    public final boolean method3268(byte arg0) {
        int var2 = -86 % ((14 - arg0) / 56);
        ++field8120;
        return this.field8121 != null;
    }

    @OriginalMember(owner = "client!paa", name = "q", descriptor = "(I)Z")
    private final boolean method3269(int arg0) {
        ++field8110;
        return arg0 != 0 ? false : this.field8121.field8352;
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(Lr;Z)Lkq;")
    public final class549 method1173(class166 arg0, boolean arg1) {
        ++field8122;
        if (this.field8121 != null && this.method3270(!arg1, 2048, arg0)) {
            class391 var3 = arg0.method130();
            int var4 = super.field6209.method2948((byte) -87);
            var3.method245(var4);
            class40 var5 = class153.field2210[super.field3019][super.field3024 >> class310.field4593][super.field3029 >> class310.field4593];
            if (var5 != null && var5.field663 != null) {
                int var6 = -var5.field663.field9906 + super.field6212;
                super.field6212 = (int) ((float) super.field6212 - (float) var6 / 10.0F);
            } else {
                super.field6212 = (int) ((float) super.field6212 - (float) super.field6212 / 10.0F);
            }
            var3.method270(super.field3024, -super.field6212 + -20 + super.field3018, super.field3029);
            class87 var7 = this.method2544(2);
            class592 var8 = this.field8121.field8315 == null ? this.field8121 : this.field8121.method3356(66, class61.field1163);
            super.field6266 = false;
            if (class287.field4270.field3721 && var8.field8310 && var7.field1456) {
                class30 var9 = ~super.field6218 != 0 && super.field6175 == 0 ? class188.field2708.method2140(super.field6218, 123) : null;
                class30 var10 = ~super.field6226 == 0 || super.field6230 && var9 != null ? null : class188.field2708.method2140(super.field6226, 126);
                class55 var11 = class67.method674(super.field6263[0], super.field6211, this.field8121.field8345, var10 == null ? var9 : var10, 65535 & this.field8121.field8335, this.field8121.field8304 & 255, this.field8121.field8354 & 65535, this.field8121.field8353 & 255, var10 == null ? super.field6194 : super.field6191, -1, var4, arg0, super.field6257, super.field6202);
                if (var11 != null) {
                    super.field6266 = true;
                    arg0.method178(false);
                    if (class676.field9574) {
                        var11.method495(var3, (class253) null, class341.field5008, 0);
                    } else {
                        var11.method513(var3, (class253) null, 0);
                    }
                    arg0.method178(true);
                }
            }
            var3.method245(var4);
            var3.method270(super.field3024, super.field3018 + -5 + -super.field6212, super.field3029);
            if (!arg1) {
                this.method951(-94);
            }
            class549 var12 = null;
            if (this.method3269(0)) {
                var12 = class26.method321(super.field6263.length, 0);
            }
            this.method2549(false, arg0, (byte) 88, super.field6263, var3);
            if (!class676.field9574) {
                for (int var13 = 0; ~super.field6263.length < ~var13; ++var13) {
                    if (super.field6263[var13] != null) {
                        super.field6263[var13].method513(var3, var12 == null ? null : var12.field7711[var13], 0);
                    }
                }
            } else {
                for (int var14 = 0; ~var14 > ~super.field6263.length; ++var14) {
                    if (super.field6263[var14] != null) {
                        super.field6263[var14].method495(var3, var12 != null ? var12.field7711[var14] : null, class341.field5008, 0);
                    }
                }
            }
            if (super.field6272 != null) {
                class499 var15 = super.field6272.method339();
                if (!class676.field9574) {
                    arg0.method156(var15);
                } else {
                    arg0.method165(var15, class341.field5008);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field6263.length; ++var16) {
                if (super.field6263[var16] != null) {
                    super.field6266 |= super.field6263[var16].method545();
                }
            }
            super.field6233 = class534.field7501;
            super.field6263[0] = super.field6263[1] = super.field6263[2] = null;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZILr;)Z")
    private final boolean method3270(boolean arg0, int arg1, class166 arg2) {
        ++field8124;
        int var4 = arg1;
        class87 var5 = this.method2544(2);
        class30 var6 = super.field6218 != -1 && super.field6175 == 0 ? class188.field2708.method2140(super.field6218, 126) : null;
        if (arg0) {
            this.method1177(-33, (class166) null);
        }
        class30 var7 = ~super.field6226 == 0 || super.field6230 && var6 != null ? null : class188.field2708.method2140(super.field6226, 127);
        int var8 = var5.field1428;
        int var9 = var5.field1434;
        if (var8 != 0 || ~var9 != -1 || var5.field1449 != 0 || var5.field1420 != 0) {
            arg1 |= 7;
        }
        boolean var10 = ~super.field6252 != -1 && ~class564.field7962 <= ~super.field6228 && class564.field7962 < super.field6185;
        if (var10) {
            arg1 |= 524288;
        }
        class55 var11 = super.field6263[0] = this.field8121.method3352(arg2, super.field6229, var6, class339.field4991, var7, super.field6207, super.field6223, class61.field1163, super.field6251, super.field6194, class188.field2708, super.field6222, super.field6191, arg1, (byte) -125);
        if (var11 == null) {
            return false;
        } else {
            super.field6206 = var11.method488();
            super.field6246 = var11.method525();
            this.method2558(var11, (byte) 100);
            int var12 = super.field6209.method2948((byte) -105);
            if (~var8 == -1 && var9 == 0) {
                this.method2545(this.method2553((byte) 105) << 9, 0, this.method2553((byte) 84) << 9, (byte) -79, 0, var12);
            } else {
                this.method2545(var8, var5.field1441, var9, (byte) -126, var5.field1453, var12);
                if (~super.field6211 != -1) {
                    super.field6263[0].method522(super.field6211);
                }
                if (~super.field6202 != -1) {
                    super.field6263[0].method494(super.field6202);
                }
                if (~super.field6257 != -1) {
                    super.field6263[0].method548(0, super.field6257, 0);
                }
            }
            if (var10) {
                var11.method497(super.field6198, super.field6215, super.field6221, super.field6252 & 255);
            }
            if (super.field6227 != -1 && super.field6192 != -1) {
                class309 var13 = class86.field1411.method1475((byte) -74, super.field6227);
                boolean var14 = ~var13.field4574 == -4 && (~var8 != -1 || var9 != 0);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (super.field6176 != 0) {
                        var15 = var4 | 5;
                    }
                    if (~super.field6177 != -1) {
                        var15 |= 2;
                    }
                }
                class55 var16 = super.field6263[1] = var13.method1967(super.field6193, class188.field2708, super.field6192, arg2, var15, super.field6164, (byte) -126);
                if (var16 != null) {
                    if (~super.field6177 != -1) {
                        var16.method548(0, -super.field6177 << 2, 0);
                    }
                    if (super.field6176 != 0) {
                        var16.method540(super.field6176 * 2048);
                    }
                    if (var14) {
                        if (super.field6211 != 0) {
                            var16.method522(super.field6211);
                        }
                        if (super.field6202 != 0) {
                            var16.method494(super.field6202);
                        }
                        if (super.field6257 != 0) {
                            var16.method548(0, super.field6257, 0);
                        }
                    }
                }
            } else {
                super.field6263[1] = null;
            }
            if (super.field6172 != -1 && super.field6200 != -1) {
                class309 var17 = class86.field1411.method1475((byte) -74, super.field6172);
                boolean var18 = var17.field4574 == 3 && (~var8 != -1 || var9 != 0);
                int var19 = var4;
                if (var18) {
                    var19 = var4 | 7;
                } else {
                    if (super.field6232 != 0) {
                        var19 = var4 | 5;
                    }
                    if (super.field6258 != 0) {
                        var19 |= 2;
                    }
                }
                class55 var20 = super.field6263[2] = var17.method1964(super.field6250, class188.field2708, (byte) -40, var19, super.field6200, arg2, super.field6239);
                if (var20 != null) {
                    if (~super.field6258 != -1) {
                        var20.method548(0, -super.field6258 << 2, 0);
                    }
                    if (super.field6232 != 0) {
                        var20.method540(super.field6232 * 2048);
                    }
                    if (var18) {
                        if (~super.field6211 != -1) {
                            var20.method522(super.field6211);
                        }
                        if (super.field6202 != 0) {
                            var20.method494(super.field6202);
                        }
                        if (super.field6257 != 0) {
                            var20.method548(0, super.field6257, 0);
                        }
                    }
                }
            } else {
                super.field6263[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)I")
    public final int method2550(int arg0) {
        if (arg0 != 1) {
            return 31;
        } else {
            ++field8111;
            if (this.field8121.field8315 != null) {
                class592 var2 = this.field8121.method3356(67, class61.field1163);
                if (var2 != null && ~var2.field8320 != 0) {
                    return var2.field8320;
                }
            }
            return this.field8121.field8320;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Z)V")
    public static final void method3271(boolean arg0) {
        if (class574.field8072 != null) {
            class574.field8072.method2012((byte) -125);
        }
        ++field8118;
        if (!arg0) {
            method3272(89);
        }
        if (class697.field9858 != null) {
            class697.field9858.method2012((byte) -123);
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILr;I)Z")
    public final boolean method1185(int arg0, int arg1, class166 arg2, int arg3) {
        ++field8135;
        if (this.field8121 != null && this.method3270(false, 131072, arg2)) {
            class391 var5 = arg2.method130();
            int var6 = super.field6209.method2948((byte) -68);
            var5.method245(var6);
            if (arg0 != -26798) {
                this.field8126 = -52;
            }
            var5.method270(super.field3024, super.field3018, super.field3029);
            boolean var7 = false;
            for (int var8 = 0; super.field6263.length > var8; ++var8) {
                if (super.field6263[var8] != null) {
                    boolean var9 = this.field8121.field8292 != -1 ? ~this.field8121.field8292 == -2 : ~this.field8121.field8345 == -2;
                    boolean var10;
                    if (!class676.field9574) {
                        var10 = super.field6263[var8].method529(arg3, arg1, var5, var9);
                    } else {
                        var10 = super.field6263[var8].method492(arg3, arg1, var5, var9, class341.field5008);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field6263[0] = super.field6263[1] = super.field6263[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "(I)V")
    public final void method947(int arg0) {
        int var2 = 1 / ((arg0 - -44) / 42);
        ++field8113;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!paa", name = "r", descriptor = "(I)V")
    public static void method3272(int arg0) {
        if (arg0 == -5926) {
            field8130 = null;
            field8128 = null;
            field8129 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "(I)I")
    public final int method2551(int arg0) {
        ++field8108;
        if (this.field8121.field8315 != null) {
            class592 var2 = this.field8121.method3356(66, class61.field1163);
            if (var2 != null && var2.field8289 != -1) {
                return var2.field8289;
            }
        }
        if (arg0 != -1145243378) {
            return -100;
        } else {
            return this.field8121.field8289 == -1 ? super.method2551(-1145243378) : this.field8121.field8289;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIZIIZ)V")
    public final void method3273(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        super.field3019 = super.field3023 = (byte) arg4;
        ++field8109;
        if (class261.method1718(arg3, 1, arg0)) {
            ++super.field3023;
        }
        if (arg5) {
            this.method3267((byte) -128, 72, -90);
        }
        if (~super.field6218 != 0 && ~class188.field2708.method2140(super.field6218, 127).field448 == -2) {
            super.field6259 = null;
            super.field6218 = -1;
        }
        if (~super.field6227 != 0) {
            class309 var7 = class86.field1411.method1475((byte) -74, super.field6227);
            if (var7.field4584 && ~var7.field4566 != 0 && ~class188.field2708.method2140(var7.field4566, 126).field448 == -2) {
                super.field6227 = -1;
            }
        }
        if (super.field6172 != -1) {
            class309 var8 = class86.field1411.method1475((byte) -74, super.field6172);
            if (var8.field4584 && ~var8.field4566 != 0 && ~class188.field2708.method2140(var8.field4566, 123).field448 == -2) {
                super.field6172 = -1;
            }
        }
        if (!arg2) {
            int var9 = -super.field6271[0] + arg0;
            int var10 = arg3 - super.field6262[0];
            if (~var9 <= 7 && ~var9 >= -9 && ~var10 <= 7 && ~var10 >= -9) {
                if (super.field6269 < 9) {
                    ++super.field6269;
                }
                for (int var11 = super.field6269; ~var11 < -1; --var11) {
                    super.field6271[var11] = super.field6271[var11 + -1];
                    super.field6262[var11] = super.field6262[var11 + -1];
                    super.field6265[var11] = super.field6265[var11 + -1];
                }
                super.field6271[0] = arg0;
                super.field6262[0] = arg3;
                super.field6265[0] = 1;
                return;
            }
        }
        super.field6268 = 0;
        super.field6271[0] = arg0;
        super.field6264 = 0;
        super.field6269 = 0;
        super.field6262[0] = arg3;
        super.field3029 = (super.field6262[0] << 9) + (arg1 << 8);
        super.field3024 = (super.field6271[0] << 9) + (arg1 << 8);
        if (super.field6272 != null) {
            super.field6272.method338();
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IZLr;Lrga;IIZ)V")
    public final void method953(int arg0, boolean arg1, class166 arg2, class215 arg3, int arg4, int arg5, boolean arg6) {
        ++field8123;
        if (!arg6) {
            method3274(-79, -81, (String) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILjava/lang/String;)I")
    public static final int method3274(int arg0, int arg1, String arg2) {
        if (arg1 != -970568439) {
            return -16;
        } else {
            ++field8112;
            return class690.method3798(true, arg2, true, arg0);
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILr;)V")
    public final void method1177(int arg0, class166 arg1) {
        ++field8115;
        if (this.field8121 != null) {
            if (super.field6270 || this.method3270(false, 0, arg1)) {
                class391 var3 = arg1.method130();
                var3.method245(super.field6209.method2948((byte) -66));
                var3.method270(super.field3024, super.field3018 - 20, super.field3029);
                this.method2549(super.field6270, arg1, (byte) 118, super.field6263, var3);
                super.field6263[arg0] = super.field6263[1] = super.field6263[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lav;B)V")
    public final void method3275(class592 arg0, byte arg1) {
        this.field8121 = arg0;
        ++field8125;
        if (super.field6272 != null) {
            super.field6272.method338();
        }
        int var3 = -6 % ((41 - arg1) / 39);
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(II)V")
    public static final void method3276(int arg0, int arg1) {
        ++field8119;
        class191 var2 = class6.method38(9, -114, arg0);
        var2.method1284((byte) -33);
        int var3 = 113 % ((arg1 - -77) / 48);
    }
}
